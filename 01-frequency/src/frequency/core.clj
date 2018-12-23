(ns frequency.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn sum-frequency-changes
  "Add together frequency changes"
  [& changes]
  (reduce + changes))
