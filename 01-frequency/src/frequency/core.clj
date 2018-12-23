(ns frequency.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn sum-frequency-changes
  "Add together frequency changes"
  [& changes]
  (reduce + changes))

(defn -main
  "Read from a file to get frequency changes."
  [& args]
  (let [changes (map read-string (str/split-lines (slurp "resources/changes.txt")))]
    (println changes)
    (println "Sum of frequency changes is:")
    (println (apply sum-frequency-changes changes))
    )
  )
