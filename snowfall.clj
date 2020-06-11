(ns grammar-of-content.snowfall)
;; designing the grammar/dsl by wishful thinking coding and implementing NYTimes classic snow fall article

;; ELEMENTS

;; chapters
;; navigation bar
;; screen as a concept


;; CONTENT

;; embedded content
    ;; quotes
    ;; pictures with captions 
    ;; videos
    ;; annotations
;; text


;; open questions
;; how do we anchor things?
;; 
;; investigate transitions. do we want to support both relative starts and hard coded anchors or just one
;; remember to use specs
;; todo later. handle string anchors by diffing new edits of text.md and erroring out if the new anchor cannot be inferred
;; related to ^^ validate that anchors are unique and throw errors if not.


(-> (nav-bar {:logo {:url "https://nytimes.com"
                     :img "./logo.jpg"}
              :chapters :all
              :social ["comments" "fb" "twitter" "mail"]})

    (chapter "Tunnel Creek"
             (screen 1
                     {:options [:no-scroll :no-text]}
                     (video "./intro.mp4" {:size "full-width" :play "loop"})
                     (header "Snow Fall" "The Avalanche at Tunnel Creek" "By John" :right :up))

             (screen 2 {:options [:scroll :drop-cap]}
                     (video {"www.link.org/happy.mp4" {:pos "right" :size 0.6}})
                     (transition-start :fade-in-next-screen))

             (screen 3 {:options [:scroll :no-text]
                        :anchor '“powder stash,” known as Tunnel Creek.'}
                     (video "./mountain.mp4" :play-once))

             (screen 4 {:options :scroll
                        :anchor 'It is a term with broad meaning.'}
                     (images {"./train-wreckage.jpg" {:pos "right" :size 0.6}
                              "./croud-of-people.jpg" {:pos "right" :size 0.6}})

                     (video {"www.nytimes.com/skiers-giggle-in-glee.mp4" {:pos "right" :cut 0.66 :size 1}})

                     (annotation {:anchor 'Rudolph promoted Stevens Pass'
                                  :img './rudolph.jpg'
                                  :title 'Chris Rudolph'
                                  :subtitle '30, Director of marketing at Stevens Pass'
                                  :link '.slideshow1.html'})

                     (annotation {:anchor 'Saugstad, 33, a former champion'
                                  :img './elyse.jpg'
                                  :title 'Elyse Saugstad'
                                  :subtitle '33, Professional freeskier'
                                  :link '.slideshow2.html'})

                     (annotation {:anchor 'Keith Carlsen, a photographer and'
                                  :img './keith.jpg'
                                  :title 'Keith Carlsen'
                                  :subtitle '38, Photographer and former editor of Powder'
                                  :link '.slideshow3.html'})

                     (annotation {:anchor 'John Stifter, arrived by train to'
                                  :img './john.jpg'
                                  :title 'John Stifter'
                                  :subtitle '29, Editor of Powder magazine'
                                  :link '.slideshow4.html'})

                     (content-box {"www.nytimes.com/photo-slideshow1.js" {:pos "right"
                                                                          :cut 0.66
                                                                          :size 1
                                                                          :caption "Several of those with plans to ski Tunnel Creek the next day huddled around a fire in front of Tim Wangen’s trailer. Among the assembled were Jim Jack, in red pants, and Tiffany Abraham, in red jacket."
                                                                          :photo-credit "Keith Carlsen"}}))

             (screen 5 {:options [:no-scroll :no-text]
                        :anchor-after 'for a mountain to move.'}
                     (video "./weather.mp4" {:size "full-width" :play "once"})

                     (paragraph "A large storm produced 32 inches of snow at Stevens Pass in the three days before the avalanche."
                                {:options [:right :up :fade-in]})

                     (paragraph "The new snow put an increasing load on a fragile crust."
                                {:options [:right :up :fade-in]
                                 :delay 5})))
    (footer {:preheader "next part"
             :header (next-chapter)
             :button {:source "./button.png"
                      :link (next-chapter)}}))

