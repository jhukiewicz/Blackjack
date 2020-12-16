package com.example.GameLogic;

import com.example.Players.Player;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Bets {

    @Autowired
    Player player;


    public int placeABet(int bet) {
        if (player.getCash() >= bet) {
            player.setCash(player.getCash() - bet);
            log.info("in place a bet, player cash ={}",player.getCash());
            return bet;
        }
        return -1;
    }

    public int returnBet(int winType, int bet) {
        log.info("returning bet = {}",calculateBet(winType, bet));
        player.setCash(player.getCash()+calculateBet(winType, bet));
        return player.getCash();
    }

    private int calculateBet(int winType, int bet) {
        if (winType == 0) {
            return bet * 2;
        } else if (winType == 1) {
            return bet * 3;
        } else if (winType == 2) {
            return bet;
        }
        return -1;
    }

}
