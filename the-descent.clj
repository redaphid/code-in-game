(ns Player
  (:gen-class))

; Auto-generated code below aims at helping you parse
; the standard input according to the problem statement.

(defn -main [& args]
  (while true
    (let [mountains (map (fn [x] (read)) (replicate 8 0))]
      (println
        (first (apply max-key second (map-indexed vector mountains)))
      )
    )
  ))
