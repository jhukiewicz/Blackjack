package com.example.Cards;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Deck.class)
class DeckTest {

    @Autowired
    Deck deck;


    @Test
    void getDeck_suits() {

        assertEquals("Diamond",deck.getDeck().get(0).getCardSuit());
        assertEquals("Diamond",deck.getDeck().get(12).getCardSuit());
        assertEquals("Club",deck.getDeck().get(13).getCardSuit());
        assertEquals("Club",deck.getDeck().get(25).getCardSuit());
        assertEquals("Heart",deck.getDeck().get(26).getCardSuit());
        assertEquals("Heart",deck.getDeck().get(38).getCardSuit());
        assertEquals("Spade",deck.getDeck().get(39).getCardSuit());
        assertEquals("Spade",deck.getDeck().get(51).getCardSuit());

    }

    @Test
    void getDeck_pips(){
        assertEquals(2,deck.getDeck().get(0).getPips());
        assertEquals(14,deck.getDeck().get(12).getPips());
        assertEquals(2,deck.getDeck().get(13).getPips());
        assertEquals(14,deck.getDeck().get(25).getPips());
        assertEquals(2,deck.getDeck().get(26).getPips());
        assertEquals(14,deck.getDeck().get(38).getPips());
        assertEquals(2,deck.getDeck().get(39).getPips());
        assertEquals(14,deck.getDeck().get(51).getPips());
    }
}