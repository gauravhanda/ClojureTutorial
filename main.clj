;; list 
(ns com.gaurav.sample (:gen-class))

(defn main 
      "This is my main method"
      [& args]
      (println (even? 10))
      (println (odd? 10))
      (println (pos? 10))
      (println (neg? 10))
      (println (number? -10))
      (println (integer? 10.5))
      (println (float? 10.5))
      (println (zero? 10.5))
      (println (zero? 0))
      )
(main)
