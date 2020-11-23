package com.example.Players;

import com.example.Cards.Card;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Player {

    private  int cash;
    private boolean dealer;
    private List<Card> cards;

    public  Player(int cash, boolean dealer) {
        this.cash = cash;
        this.dealer = dealer;
        this.cards = new ArrayList<>();
    }
}
