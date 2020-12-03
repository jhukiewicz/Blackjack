package com.example.GameLogic;

import com.example.Cards.Card;
import com.example.Cards.Deck;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class DeckConfig {

    public List<Card> shuffleDeck(Deck deck){
        List<Card> shuffledDeck = deck.getDeck();
        Collections.shuffle(shuffledDeck);
        return shuffledDeck;
    }
}
