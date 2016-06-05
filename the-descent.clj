(ns Player
  (:gen-class))

; Auto-generated code below aims at helping you parse
; the standard input according to the problem statement.

(defn -main [& args]
  (while true
    (let [mountans (map (replicate 8 0) (read)]
    (loop [i 8]
      (when (> i 0)
        (let [mountainH (read)]
          ; mountainH: represents the height of one mountain, from 9 to 0.
        (recur (dec i)))))

    ; (binding [*out* *err*]
    ;   (println "Debug messages..."))

    ; The number of the mountain to fire on.
    (println "4")))
