package com.example.GameLogic;
import com.example.Cards.Deck;

import com.example.Players.Player;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.Random;


public class CardManager {

    @Autowired
    Deck deck;

    @Autowired
    Random random;

    @Autowired
    public CardManager() {
    }


    public boolean drawCard(Player player){
        return player.getCards().add(deck.getDeck().get(random.nextInt(deck.getDeck().size())));
    }

    public void shuffleDeck(){
        Collections.shuffle(deck.getDeck());
    }



}
