package com.example.GameLogic;

import com.example.Players.HumanPlayer;
import com.example.Players.Player;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Bets.class, HumanPlayer.class})
class BetsTest {

    @Autowired
    Player player;

    @Autowired
    Bets bets;

    int bet = 300;

    @Test
    void placeABet() {
        assertEquals(300, bets.placeABet(player,bet));
        assertEquals(2200,player.getCash());
    }

    @Test
    void calculateBet_normalWin() {
        assertEquals(600,bets.calculateBet(WinTypes.NORMAL,bet));
    }

    @Test
    void calculateBet_blackjack() {
        assertEquals(900,bets.calculateBet(WinTypes.BLACKJACK,bet));
    }

    @Test
    void calculateBet_push() {
        assertEquals(300,bets.calculateBet(WinTypes.PUSH,bet));
    }
}