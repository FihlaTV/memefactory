(ns memefactory.styles.component.challenge-list
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [clojure.string :as s]
   [memefactory.styles.base.colors :refer [color]]
   [memefactory.styles.base.media :refer [for-media-min for-media-max]]
   [memefactory.styles.base.fonts :refer [font]]
   [memefactory.styles.base.fonts :refer [font]]
   [memefactory.styles.component.buttons :refer [button]]
   [garden.units :refer [px em pt]]))


(defstyles core
  [:.challenges.panel   
   {:padding (em 2)}
   [:.controls {:width (em 11)
                :margin-left :auto
                :margin-right 0}] 
   [:.challenge
    {:display :grid
     :grid-template "'info image action'"
     :grid-gap (em 2)
     :background-color :white
     :margin-bottom (em 1.5)
     :border-radius (em 0.6)
     :padding (em 1.4)}
    (for-media-max :tablet
                   [:& {:grid-template "'image' 'info' 'action'"}])
    [:.info {:overflow :hidden
             :grid-area :info}
     [:h2
      {:color (color :purple)
       :text-transform :uppercase}
      (font :bungee)
      (for-media-max :tablet
                     [:& {:text-align :center}])]
     [:h3 {:color (color :menu-text)
           :font-weight :bold
           :font-size (em 1)
           :margin 0}]
     [:ol
      {:list-style-type :none
       :padding 0
       :margin-top (em 0.4)
       :color (color :menu-text)}
      [:&.tags ;; TODO refactor out tags from here
       {:margin-top (em 2)}
       [:li {:text-transform :capitalize
             :background-color (color :tags-grey)
             :margin (em 0.3)
             :padding-left (em 1.5)
             :padding-right (em 1.5)
             :padding-top (em 0.5)
             :border "1px solid #e1b4ef"
             :padding-bottom (em 0.5)
             :border-radius (em 2)
             :display :inline}]]
      [:li {:margin-bottom (em 0.2)}
       [:div {:display :flex}
        [:label {:margin-right (em 0.2)}]
        [:span {:overflow :hidden
                :white-space :nowrap
                :text-overflow :ellipsis}]]]]]
    [:div.meme-tile {:display :grid
                     :grid-area :image
                     :justify-items :center}
     [:.meme-card {:position :relative}]] 
    [:.action {:margin :auto
               :grid-area :action}]]])
