(ns clojure-in-docker.core)

(defn -main  [& args]
  "I don't do a whole lot."
  (println "Hello, World!")
  (doseq [arg args] (println arg)))
