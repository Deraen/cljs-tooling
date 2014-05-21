(defproject cljs-tooling "0.1.3-SNAPSHOT"
  :description "Tooling support for cljs"
  :url "https://github.com/gtrak/cljs-tooling"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [org.clojure/tools.reader "0.8.0"]
                                  [org.clojure/clojurescript "0.0-2202"]
                                  [org.clojure/core.async "0.1.303.0-886421-alpha"]
                                  [om "0.6.2"]]
                   :resource-paths ["test-resources"]}}
  
  )
