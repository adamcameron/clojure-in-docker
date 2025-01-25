(defproject clojure-in-docker "0.1.0-SNAPSHOT"
  :description "Clojure scratch pad in a Docker container"
  :dependencies [[org.clojure/clojure "1.12.0"]]
  :main clojure-in-docker.core
  :repl-options {:init-ns clojure-in-docker.core})
