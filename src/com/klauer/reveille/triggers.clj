(ns com.klauer.reveille.triggers
  (:require [clojurewerkz.quartzite.triggers :as t]
            [clojurewerkz.quartzite.schedule.simple :as ss]))

(defn a-trigger [& args]
  (let [trigger (t/build
                  (t/with-identity (t/key "triggers.1"))
                  (t/start-now)
                  (t/with-schedule (ss/schedule 
                                     (ss/with-repeat-count 10)
                                     (ss/with-interval-in-milliseconds 200))))]))

