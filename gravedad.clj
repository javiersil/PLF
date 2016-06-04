(ns examenuno.gravedad
  (:require [examenuno.fda :as fda] :reload)
  
  )

(def centro (fn [xs ] 
               
              (let [
                    la-suma (fn [es ]  (fda/vreduce (fn [a b] (+ a b)) 0  es    ) ) 
                    busca-centro (fn [ys zs ac ] (if (
                                                      =  
                                                      (la-suma zs)
                                                       (la-suma ys)
                                                        )
                                                   ;;si
                                                  (conj [] (count ys ))
                                                  ;; noo
                                                  ac
                                                  )   )]
                (fda/recorrer  busca-centro xs  [])
               
                )
               
              )
  )

;;::::  aqui se pueden ver las aplicaciones 
(centro [1 3 4 5 -2 1])
(centro [1 6 4 5 -2 1])
(centro [1 2 3 4 3 2 1])
(centro [])
(centro [5])
(centro [3 3 3 3])
(centro [3 3 3 3 3])
(centro [-1 -2 -3 -4 -3 -2 -1])
(centro [1 100 50 -51 1 1])