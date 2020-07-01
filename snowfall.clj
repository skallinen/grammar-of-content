(ns grammar-of-content.snowfall)


(-> (nav-bar {:logo {:url "https://nytimes.com"
                     :img "./logo.jpg"}
              :chapters :all
              :social ["comments" "fb" "twitter" "mail"]})

    (post "Tunnel Creek"
          "./path/tunnel_creek.md"  ;; chapter will be multimethod which dispatches on file types
          (screen {:options [:no-scroll :interrupt-flow]}
                  (video "./intro.mp4" {:size "full-width" :play "loop"})
                  (title {:header "Snow Fall"
                          :sub-header "The Avalanche at Tunnel Creek"
                          :byline ["John Branch"]}
                         {:pos [:right :up]
                          :options [:fade-in]}))

          (transition :partial-slide-up)

          (screen {:options [:drop-cap]}
                  (video "http://nytimes.com/saugstad.mp4"
                         {:pos :right :size 0.6}))

          (transition :fade-in)

          (screen {:anchor "“powder stash,” known as Tunnel Creek."
                   :options [:no-scroll :interrupt-flow]}
                  (video "./mountain.mp4" {:options [:play-once]}))

          (screen (images ["./train-wreckage.jpg" "./crowd-of-people.jpg"]
                          {:pos :right
                           :size 0.6
                           :anchor "In late February 1910, ceaseless"
                           :caption "Wreckage after the Wellington, Wash., avalanche in 1910, which buried two passenger trains marooned by snowstorms outside the Cascade Tunnel and killed 96 people. Rescue workers transported bodies from the scene on sleds."
                           :photo-credit "Museum of History & Industry"})

                  (video "www.nytimes.com/skiers-giggle-in-glee.mp4"
                         {:pos :right
                          :cut 0.66
                          :anchor "makes skiers giggle in glee"})

                  (annotation {:anchor "Rudolph promoted Stevens Pass"
                               :img "./rudolph.jpg"
                               :title "Chris Rudolph"
                               :subtitle "30, Director of marketing at Stevens Pass"
                               :link ".slideshow1.html"})

                  (annotation {:anchor "Saugstad, 33, a former champion"
                               :img "./elyse.jpg"
                               :title "Elyse Saugstad"
                               :subtitle "33, Professional freeskier"
                               :link ".slideshow2.html"})

                  (annotation {:anchor "Keith Carlsen, a photographer and"
                               :img "./keith.jpg"
                               :title "Keith Carlsen"
                               :subtitle "38, Photographer and former editor of Powder"
                               :link ".slideshow3.html"})

                  (annotation {:anchor "John Stifter, arrived by train to"
                               :img "./john.jpg"
                               :title "John Stifter"
                               :subtitle "29, Editor of Powder magazine"
                               :link ".slideshow4.html"})

                  (content-box {"www.nytimes.com/photo-slideshow1.js" {:pos :right
                                                                       :cut 0.66
                                                                       :size 1
                                                                       :caption "Several of those with plans to ski Tunnel Creek the next day huddled around a fire in front of Tim Wangen’s trailer. Among the assembled were Jim Jack, in red pants, and Tiffany Abraham, in red jacket."
                                                                       :photo-credit "Keith Carlsen"}}))

          (screen {:options [:no-scroll :interrupt-flow]
                   :anchor "for a mountain to move."}
                  (video "./weather.mp4" {:size "full-width" :play "once"})

                  (paragraph "A large storm produced 32 inches of snow at Stevens Pass in the three days before the avalanche."
                             {:options [:right :up :fade-in]})

                  (paragraph "The new snow put an increasing load on a fragile crust."
                             {:options [:right :up :fade-in]
                              :delay 5})))

 (footer {:preheader "next part"
          :header (next-post)
          :button {:source "./button.png"
                   :link (next-post)}}))
