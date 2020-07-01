# grammar-of-content
A simple DSL and grammar to generate static sites with rich content.

## Some inspirations and examples
Quil
Tidyverse (dplyr, ggplot2)
Ronin
SQL


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

;; size is in terms of columns
;; size = 1 means full width of text


;; open questions
;; how do we anchor things?
;; 
;; investigate transitions. do we want to support both relative starts and hard coded anchors or just one
;; remember to use specs
;; todo later. handle string anchors by diffing new edits of text.md and erroring out if the new anchor cannot be inferred
;; related to ^^ validate that anchors are unique and throw errors if not.
;; note to self: the text here is the "red thread" that guides the flow of the article, but could be a video, audio as wel.
;; think of good name for the concept.