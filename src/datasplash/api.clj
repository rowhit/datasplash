(ns datasplash.api
  (:refer-clojure :exclude [map filter mapcat group-by
                            distinct flatten concat])
  (:require [datasplash.core :as dt])
  (:gen-class))

(def make-transit-coder dt/make-transit-coder)
(def generate-input dt/generate-input)
(def view dt/view)
(def pardo dt/pardo)
(def identity dt/didentity)
(def map dt/dmap)
(def filter dt/dfilter)
(def mapcat dt/dmapcat)
(def to-edn dt/to-edn)
(def from-edn dt/from-edn)
(def with-keys dt/with-keys)
(def group-by-key dt/group-by-key)
(def group-by dt/dgroup-by)
(def make-pipeline dt/make-pipeline)
(def read-text-file dt/read-text-file)
(def read-edn-file dt/read-edn-file)
(def write-text-file dt/write-text-file)
(def write-edn-file dt/write-edn-file)
(def cogroup dt/cogroup)
(def cogroup-by dt/cogroup-by)
(def distinct dt/ddistinct)
(def flatten dt/dflatten)
(def concat dt/dconcat)
(def combine-globally dt/combine-globally)
(def juxt dt/djuxt)
(def sum dt/sum)
