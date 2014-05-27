A document written with `hyde-pallet` is a Markdown document with a
few extra features.

## Tags

Hyde provides an extensible tagging system for adding information from
clojure-land into your pages. Tags are demarcated between
`\[\*` and `\*\]`, and contain an [EDN Tagged Literal][tagged literals].
Tagged literals have the follwing format:

```
\[\* #<tag-name> <tag-expression> \*\]
```

where `tag-name` has the format `<ns>/<name>` and `tag-expression` can
be any EDN expression (read: clojure data structure). For example

```
\[\* #pallet/api-entry "clean-api \*\]"
```

[tagged literals]: https://github.com/edn-format/edn#tagged-elements

The following are examples of tags:

### link to an api function

The `#pallet/api-link` tag creates a link to  the documentation for a
function. The function could be anywhere in the source code. For
example, to create this link to the function
[* #pallet/api-link "clean-api" *] you use:

```
\[\* #pallet/api-link "clean-api \*\]
```

### Summary for an api function

[* #pallet/api-entry "clean-api" *]



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

<table class="table">
<thead>
<tr><th>Parameter</th><th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>
{% capture content %}
* this
* is
* a
* test
{% endcapture %}
{{ content | markdownify }}
</td>
<td>
{% capture content %}
```clojure
(this is
   (another test))
```
{% endcapture %}
{{ content | markdownify }}
</td>
</tr>
</tbody>
</table>

[* #pallet/table [["Parameter" "Description"]
[["* this\n* is\n* a \n* test"
"```clojure
(this is
   (another test))
```"]]] *]

## License

### test

Copyright © 2014 Hugo Duncan, Antoni Batchelli

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
