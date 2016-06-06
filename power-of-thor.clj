(ns Player
  (:gen-class))

(defn -main [& args]
  (let [lightX (read) lightY (read) initialTX (read) initialTY (read)
        vectorX (if (< lightX initialTX) (repeat (- initialTX lightX) "W" ) (repeat (- lightX initialTX) "E" ))
        vectorY (if (< lightY initialTY) (repeat (- initialTY lightY) "N" ) (repeat (- lightY initialTY) "S" ))
        ]


  (defn turn [vectorX vectorY] (
    (let [remainingTurns (read) x (first vectorX) y (first vectorY)]
      (if y (print y))
      (if x (print x))
      (println)
    )
    (turn (rest vectorX) (rest vectorY))
  ))

  (turn vectorX vectorY))
)
