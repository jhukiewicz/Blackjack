package com.example.Cards;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Slf4j
public class Card {

    private String cardSuit;
    private int pips;

    @Autowired
    public Card(String cardSuit, int pips) {
        this.cardSuit = cardSuit;
        this.pips = pips;
    }
}
