package com.example.Players;

import com.example.Cards.Card;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Slf4j
@Component
public abstract class Player {

    @Setter
    private  int cash;

    private boolean dealer;
    private List<Card> cards;

    public  Player(int cash, boolean dealer) {
        this.cash = cash;
        this.dealer = dealer;
        this.cards = new ArrayList<>();
    }
}
