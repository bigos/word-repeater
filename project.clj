(defproject word-repeater "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GNU GENERAL PUBLIC LICENSE Version 2"
            :url "http://www.gnu.org/licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot word-repeater.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
