package com.example.Cards;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Deck {

    @Getter
    private List<Card> deck;

    @Autowired
    public Deck() {
        this.deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                deck.add(new Card(Suits.cardsSuits[i], j));
    }

//    @PostConstruct
//    void constructDeck() {
//        log.info("In post construct");
//
//            }
        }
    }
}
