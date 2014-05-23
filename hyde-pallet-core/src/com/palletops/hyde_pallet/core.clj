(ns com.palletops.hyde-pallet.core
  (:require [palletops.hyde :as hyde]
            [clojure.walk :refer [postwalk]]
            [clojure.edn :as edn]
            [clojure.java.io :refer [resource file as-file]]
            [clojure.string :as string]
            [com.palletops.docudata.extract :as docudata]))

(def jekyll-config
  {:gems
   [{:gem "jekyll" :version "2.0.3"}
    {:gem "rouge" :version "~> 1.3"}
    {:gem "coderay"}]})

(def site-config
  {:template :crate
   :config
   {:name "test site"
    :title "test title"
    :description "this si a long description"
;;    :highlighter "rouge"
    :markdown "kramdown"
    :kramdown {:use_coderay "true"
               :enable_coderay "true"
               :input "GFM"
               :hard_wrap "false"
               :coderay
               {:coderay_line_numbers "nil"
                :coderay_css "class"
                :coderay_wrap "div"
                :coderay_tab_width "2"
                :coderay_bold_every "false"}}
    :collections
    {:api
     {:output true
      :layout "post"}}}})


(defn clean-api [api-doc]
  (let [;; if `d` is a map, replace the value for key `k` with the
        ;; results of applying the function `fk` to it
        swapper (fn [d k fk]
                  (if-let [v (k d)]
                    (assoc d k (fk v))
                    d))
        ;; turn all symbols into strings
        clean-arglists (fn [al]
                         (postwalk (fn [x] (if (symbol? x) (str x) x)) al))
        indent-md-headers (fn [d] (-> d
                                     (string/replace #"^#" "###")
                                     (string/replace #"\n#" "\n###")))
        clean (fn [d]
                (-> d
                    (swapper :ns str)
                    (swapper :name str)
                    (swapper :var-type (comp str name))
                    (swapper :ns-name str)
                    (swapper :arglists clean-arglists)
                    (swapper :doc indent-md-headers)))]
    (postwalk clean api-doc)))

(defrecord Project [project])
(defmethod hyde/render Project [p]
  (format "[%s](http://github.com/pallet/%s)" (:project p) (:project p)))

(def ^:dynamic *api* {})

;; #dd/start test
(defrecord Snippet [snippet])
(defmethod hyde/render Snippet [s]
  (let [snippets (:snippets api)
        key (keyword (:snippet s))]
    (:content (get snippets key))))
;; #dd/end

(defn build-site [root jekyll-config site-config]
  (hyde/create-collections-dirs! root site-config)
  (hyde/write-gemfile! root jekyll-config)
  (hyde/write-config! root site-config)
  (hyde/copy-resources! root site-config)
  (hyde/write-document! root {:path "_posts/2012-01-01-my-example.md"
                              :content "this is a *test*!"
                              :front-matter
                              {:title "This is the document"
                               :index 1}})
  (hyde/write-data!
   root "topbar-menu"
   {:brand "Sample Crate"
    :main-options
    [{:title "Home" :href "/"}
     {:title "Documentation" :href "/README.html"}
     {:title "API" :href "/api.html"}
     {:title "About" :href "/about"}]})

  (binding [hyde/*tag-map* {'pallet/project #'->Project
                            'hyde/snippet #'->Snippet}
            *api* (clean-api
                  ;; TODO: the source paths should come from the project
                  {:namespaces (doall (docudata/docudata ["src"] {}))
                   :snippets (doall (docudata/snippets-in-path "."))}
                  ;;(edn/read-string (slurp "target/docudata.edn"))
                  )]
    (hyde/write-data! root "api-doc" *api*)
    (hyde/write-collection!
     root
     "api"
     {:index-key :my-index
      :docs [{:path "doc-a.md"
              :front-matter
              {:title "doc a"
               :layout "default"}
              :content "this is doc *a*"}
             {:path "doc-b.md"
              :front-matter
              {:title "doc b"
               :layout "default"}
              :content "this is verbatim *b* [* #pallet/project pallet *]"}]})
    (hyde/write-document!
     root
     {:path "README.md"
      :front-matter
      {:title "lein-pallet-release"
       :layout "doc"}
      :content
      "A Leiningen plugin to release PalletOps projects.


Releases are made by creating a local release branch which is pushed
to github. [* #pallet/project pallet *] The branch will be
built by travis, and pushed to master and develop if it succeeds. Jars
are then built locally from master and pushed to clojars.

## Usage

Add the plugin to your `:user` `:plugins` in `~/.lein/profiles.clj`:

```clojure
:plugins [[lein-pallet-release \"0.1.17\"]]
```
Install the
[travis command line](http://blog.travis-ci.com/2013-01-14-new-client/).

### init

The `init` subcommand is used to initialise a project for releasing
with a test on travis.  It requires a single argument, a 40 digit hex
github key for the `pbors` github user, that will be used to authorise
travis to push to github master if the build succeeds.  The key should
only have permissions to read and write repositories.

```
lein pallet-release init 435afe787ab878c32432435afe787ab878c32432
```

This will write the `.travis.yml` file if it doesn't exist.  It will also
add the plugin and configuration to `profiles.clj`.

After running the command, inspect the created files and commit them.
{: .alert .alert-success}

### start

To start a release, run:

```shell
lein pallet-release start previous-release new-release
```

This will create a release branch, enable the project on travis, and
update release notes, readme, etc.

After running, check the modifications.  Anything modified will be
commited by the `finish` command.

### finish <span class=\"label label-primary\">New</span>

To finish a release, run:

```shell
lein pallet-release finish
```

This will commit any modified files (eg. README.md, project.clj, etc)
with a commit message including the version number.

It then pushes the branch to github, from where travis will build it,
and push it back to the `master` and `develop` branches on github.

## test

alsfkjafs;dlkfj
lasjfda;slkdj
;lkjsdf;askjl

### snippet

this is some code snippet

```clojure
[* #hyde/snippet test*]
```

### Configuration

You can specify the url and branch travis should push to on the
 `:pallet-release` key.

```clojure
:pallet-release {:url \"Url for travis to push to\"
                 :develop-branch \"develop\"
                 :branch \"master\"}
```

## More clojure

```clojure
(defn sub-file
  \"Given a root path, it provides the path to a subdirectory defined
  by the subs vector of directory names\"
  [root subs]
  (path/render-path
   (path/normalize*
    (apply conj (path/parse-path root) subs))))

(defn sub-dir [root subs]
  (path/ensure-trailing-separator (sub-file root subs )))

(defn-api write-config!
  {:sig [[s/Str Site-Config :- s/Bool]]}
  [root {:keys [config] :as site-config}]
  (let [content (yaml/generate-string config)
        config-path (sub-file root [\"_config.yml\"])]
    (println \"path is\" config-path)
    (println \"content is\" content)
    (spit config-path content)
    true))

(defn gemfile [config]
  (stencil/render-file  \"Gemfile\" config))

(defn-api write-gemfile!
  {:sig [[s/Str Jekyll-Config :- s/Bool]]}
  [root config]
  (let [content (gemfile config)
        path (sub-file root [\"Gemfile\"])]
    (spit path content)
    true))

(defn-api create-collections-dirs!
  {:sig [[s/Str Site-Config :- s/Bool]]}
  [root {:keys [config]}]
  (let [default-dirs [\"_posts\" \"_includes\" \"_layouts\" \"_data\"]
        collections (-> config :collections keys)
        collection-dirs (map #(str \"_\" (name %)) collections)
        all-dirs (concat default-dirs collection-dirs)
        all-paths (map (partial sub-dir root) (map vector all-dirs))]
    (doseq [p all-paths] (println p))
    (doall (map fs/mkdirs all-paths))
    true))
```

## License

### test

Copyright © 2014 Hugo Duncan, Antoni Batchelli

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version."})))
