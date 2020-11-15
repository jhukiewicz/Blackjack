package com.example.Cards;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Deck.class)
class DeckTest {

    @Autowired
    Deck deck;

    @Test
    void getDeckCardsValues() {


        assertEquals("Diamond",deck.getDeck().get(0).getCardSuit());
        assertEquals(2,deck.getDeck().get(0).getPips());

        assertEquals("Diamond",deck.getDeck().get(12).getCardSuit());
        assertEquals(14,deck.getDeck().get(12).getPips());

        assertEquals("Club",deck.getDeck().get(13).getCardSuit());
        assertEquals(2,deck.getDeck().get(13).getPips());

        assertEquals("Club",deck.getDeck().get(25).getCardSuit());
        assertEquals(14,deck.getDeck().get(25).getPips());

        assertEquals("Heart",deck.getDeck().get(26).getCardSuit());
        assertEquals(2,deck.getDeck().get(26).getPips());

        assertEquals("Heart",deck.getDeck().get(38).getCardSuit());
        assertEquals(14,deck.getDeck().get(38).getPips());

        assertEquals("Spade",deck.getDeck().get(39).getCardSuit());
        assertEquals(2,deck.getDeck().get(39).getPips());

        assertEquals("Spade",deck.getDeck().get(51).getCardSuit());
        assertEquals(14,deck.getDeck().get(51).getPips());
    }
}