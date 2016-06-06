(ns plf.practica)

;;   vreduce  para  vectores 
;; es una  funcion de orden superior
(def vreduce  (fn [f vi xs]
     (letfn [(g [h ac ys] 
               (if (= (first ys) nil)
                 ac
                 (g h (h ac (first ys))  (rest ys)  )
                 )
               )]
       (g f vi xs)
       )) 
  )

;;; ...Fin-.....

; Inserta al inicio de xs a x
;opera para  vectores
(def vconji (fn [xs x]
              (let [vi (conj [] x)
                    f (fn [ys y] ( conj ys y ) )
                    
                    ]
                (vreduce f vi xs)
                )
              
              ))

;;;; .... Fin......;;;;;




(def multiplicadora (fn [numero ]   
                      (letfn [ (f [ n]
                                 (if ( even? n )
                                   ( / n 2 )
                                    (/ (- n 1) 2)
                                   )
                                 
                                 )
                              ;;;  g  es una funcion recursiva
                  (g [h vec n ] 
                     (if (= n 1)
                       (vconji vec n) 
                       (g h (vconji vec n) (h n) )
                      )
                   ) ;;... Fin de g
               
                  ]
                       (g f [] numero)
              )
                      
 ))


;; Aplicacion 
(multiplicadora 17)