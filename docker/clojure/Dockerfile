FROM clojure:lein

RUN apt-get update
RUN apt-get install vim --yes

COPY ./docker/clojure/root_home/.bashrc /root/.bashrc
COPY ./docker/clojure/root_home/.vimrc /root/.vimrc

WORKDIR /usr/src/clojure-in-docker

COPY ./project.clj .

EXPOSE 7888

RUN lein deps
#RUN ["lein", "repl", ":headless", ":host", "0.0.0.0", ":port", "7888"]
