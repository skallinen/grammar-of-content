(ns boeing-737)


(-> (nav-bar {:options [:overlay] ;; defaults to transparent background
              :logo {:url "https://nytimes.com"
                     :img "./logo.jpg"
                     :title "Home"}
              :navigation ["nyt" "business"]
              :social ["share"]})

    (post "boeing-737-max-8-flaws"
          "./path/boeing-737.mp4"  ;; chapter will be multimethod which dispatches on file types
          (screen {:anchor 1
                   :options [:no-scroll]} ;; pauses at first frame
                  (title {:header "The Dangerous Flaws in Boeing's Automated System"
                          :byline ["Mika Gröndahl" "Keith Collins" "James Glanz"]
                          :date "UPDATED April 4, 2019"}
                         {:pos [:left :down]
                          :options [:fade-out]}))

          (screen {:anchor 120} ;; assumption: 30 frames per second
                  (text-box "./path/text.md"
                            {:pos :left
                             :size 0.25
                             :options [:scroll]}))

          (screen {:anchor 180}
                  (text-box "./path/text2.md"
                            {:pos :left
                             :size 0.25
                             :options [:scroll]}))

          (screen {:anchor 300}
                  (text-box "./path/text3.md"
                            {:pos :left
                             :size 0.25
                             :options [:scroll]}))

          (transition :fade-out)

          (screen {:anchor 1000
                   :options [:interrupt-flow]}
                  (text "./path/text3.md"))))