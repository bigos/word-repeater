(defproject word-repeater "0.1.0-SNAPSHOT"
  :description "program to train your for learning new vocabulary"
  :url "http://example.com/FIXME"
  :license {:name "GNU GENERAL PUBLIC LICENSE Version 2"
            :url "http://www.gnu.org/licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-yaml "0.4.0"]
                 [seesaw "1.4.2"]
                 [com.github.insubstantial/substance "7.1"]
                 [org.clojars.technomancy/jlayer "1.0"]]
  :main ^:skip-aot word-repeater.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
