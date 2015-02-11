(ns stackoverflow)
(defn recurse [x]
  (print (str x " "))
  (recurse (+ 1 x))

  )
(recurse 1)

("fails at 6231 for me ;)")