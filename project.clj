(defproject cljs-tooling "0.1.2-SNAPSHOT"
  :description "Tooling support for cljs"
  :url "https://github.com/gtrak/cljs-tooling"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.reader "0.8.0"]]
                   :resource-paths ["test-resources"]}}
  
  )
