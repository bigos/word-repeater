(ns word-repeater.core
  (:use [seesaw.core])
  (:import  org.pushingpixels.substance.api.SubstanceLookAndFeel)
  (:require [clojure.string :as str]
            [clj-yaml.core :as yaml]
            [clojure.java.io :as io])
  (:gen-class))

(defn play-file [filename & opts]
  (let [fis (java.io.FileInputStream. filename)
        bis (java.io.BufferedInputStream. fis)
        player (javazoom.jl.player.Player. bis)]
    (if-let [synchronously (first opts)]
      (doto player
        (.play)
        (.close))
      (.start (Thread. #(doto player (.play) (.close)))))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
