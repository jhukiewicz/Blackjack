package com.example.GameLogic;

import com.example.Players.HumanPlayer;
import com.example.Players.Player;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Bets.class, HumanPlayer.class})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class BetsTest {

    @Autowired
    Player player;

    @Autowired
    Bets bets;

    int bet = 300;

    @Test
    void placeABet() {
        assertEquals(300, bets.placeABet(bet));
        assertEquals(2200,player.getCash());
    }

    @Test
    void returnBet_normalWin() {
        bets.placeABet(bet);
        assertEquals(2800,bets.returnBet(WinTypes.NORMAL,bet));
    }

    @Test
    void calculateBet_blackjack() {
        bets.placeABet(bet);
        assertEquals(3100,bets.returnBet(WinTypes.BLACKJACK,bet));
    }

    @Test
    void calculateBet_push() {
        bets.placeABet(bet);
        assertEquals(2500,bets.returnBet(WinTypes.PUSH,bet));
    }
}