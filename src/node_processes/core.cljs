(ns node-processes.core 
  (:require [cljs.core.async :as async :refer [<! >! chan close! timeout]])
  (:require-macros [cljs.core.async.macros :as m :refer [go alt!]]))

(defn -main [& args]
  (let [beb (chan)]
      (go
       (loop [x 1]
           (<! (timeout 200))
           (>! beb "hello")
           (println x)
           (println "world!")
           (recur (+ x 1))))
      (go
       (loop [x 1]
           (println (<! beb))
           (recur (+ x 1))))
       (println "Beb....."))
)
(set! *main-cli-fn* -main)
