# hyde-pallet-crate

Generate documentation sites for code projects.

## Usage

There is some basic configuration possible in project.clj:

  :hyde
  {:title "maven crate"
   :menu [{:title "Home" :href "/"}
          {:title "Documentation" :href "/README.html"}
          {:title "API" :href "/api.html"}]
   :menu-extras [{:title "Example" :href "/example.html"}]
   :data-files {"topbar-menu" {:brand "MAVEN CRATE"}}


## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
