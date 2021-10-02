(ns clojure-in-docker.greeting
  (:gen-class))

(defn greet
  ([args]
   (str "G'day " (or (first args) "World"))))

(defn -main
  "I greet someone or everyone"
  [& args]
  (println (greet args)))
