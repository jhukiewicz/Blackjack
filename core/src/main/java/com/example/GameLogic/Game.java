package com.example.GameLogic;

import com.example.Cards.Deck;
import com.example.Players.Dealer;
import com.example.Players.HumanPlayer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class Game {

    @Autowired
    private Dealer dealer;
    @Autowired
    private HumanPlayer player;
    @Autowired
    private Deck deck;

}
