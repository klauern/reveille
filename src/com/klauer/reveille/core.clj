(ns com.klauer.reveille.core
  (:require [clojurewerkz.quartzite.scheduler :as qs]
            [clojurewerkz.quartzite.jobs :as jobs]
            [clojurewerkz.quartzite.triggers :as t]
            [clojurewerkz.quartzite.schedule.simple :as s])
  (:use [clojurewerkz.quartzite.jobs :only [defjob]]))

(defn -main [& m]
  (qs/initialize)
  (qs/start)
  (let [job (jobs/build
              (jobs/of-type PrintLnJob)
              (jobs/with-identity (jobs/key "jobs.println.1")))]))

(defjob PrintLnJob
  [ctx]
  (println "Hello"))