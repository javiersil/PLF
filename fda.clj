(ns examenuno.fda)


;;;;  Funciones sobre  vectores  
;;; Funciones de orden superior 
;;;;    vreduce;;;
;;;;;============================;;;;;;

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
;;;;..---Fin---..;;;;





;;;;Funciones recursivas ..---

;;; Recorrer es funcion recursiva pero igual de orden superior :D
;; recie  a f   como funcion  y  a  xs  como secuencia de elementos
(def recorrer (fn  [ f   xs vac]
                (letfn [(g [ys zs  f ac]
                          (if (nil? (first zs))
                            ac
                              
                            (g (conj ys ( first zs )) 
                               (rest zs) 
                                f
                               (f ys (rest zs) ac)
                               )
                            )
                            
                          )]
                   ;;    vac funciona como  funciona como  
                   ;;    "acumulador inicial"
                  (g [] xs f  vac )
                  )                                   
                )
 )


;;:::::::________Fin:________




