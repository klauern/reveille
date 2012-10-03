(ns com.klauer.reveille.core-test
  (:use [midje.sweet]))

;; how to use midje to test out the expressions I want to simplify the DSL with
;; maybe I could emulate or integrate https://github.com/aredington/monotony.
;; does monotony do what I need to do already?  It seems more geared to tease out times,
;; not much in the way of scheduling events based on them.  Either that, or the docs are
;; incredibly poor at showing how to utilize a schedule item somewhere.


;; just reading the docs, it seems that it's a very interesting wrapper around
;; expressive representations of timed events.  So it's more about defining WHEN,
;; not wrapping a WHAT around it.  Maybe it will work, maybe not.
