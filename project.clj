(defproject node-processes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.0-SNAPSHOT"]
                 [org.clojure/core.match "0.2.0-rc5"]
                 [org.bodil/cljs-noderepl "0.1.10"]]
  :plugins [[lein-cljsbuild "0.3.2"]
            [org.bodil/lein-noderepl "0.1.10"]]
  :cljsbuild {:builds [{:source-paths ["src/"]
                        :compiler {:output-to "hello.js"
                                   :target :nodejs
                                   :optimizations :simple
                                   :pretty-print true}}]}
   :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"})
