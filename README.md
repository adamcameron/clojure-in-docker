# clojure-in-docker
Clojure scratch pad in a Docker container

## Install

```
$ cd ~/src
$ git clone git@github.com:adamcameron/clojure-in-docker.git
$ cd ~/src/clojure-in-docker/docker
$ docker compose build
[stuff snipped]

$ docker compose up --detach
[stuff snipped]

$ docker exec -it clojure-in-docker-clojure-1 lein repl :connect localhost:7888

clojure-in-docker.core=>
clojure-in-docker.core=> (println "G'day world")
G'day world
nil
clojure-in-docker.core=>
^d # IE: CTRL-D to exit the repl

$ 
$ docker exec clojure-in-docker-clojure-1 lein test

lein test clojure-in-docker.core-test

lein test clojure-in-docker.greeting-test

Ran 4 tests containing 4 assertions.
0 failures, 0 errors.

$ 
$ docker exec clojure-in-docker-clojure-1 lein run arg1 arg2 arg3
Hello, World!
arg1
arg2
arg3
```

Might need to wait for a bit between bringing the container up, and the running stuff.
I got an error if I didn't wait for a bit.

