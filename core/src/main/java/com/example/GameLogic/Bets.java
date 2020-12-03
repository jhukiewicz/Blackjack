package com.example.GameLogic;

import com.example.Players.Player;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Bets {

    public int placeABet(Player player, int bet) {
        if (player.getCash() >= bet) {
            player.setCash(player.getCash() - bet);
            return bet;
        }
        return -1;
    }

    public void returnBet(Player player, int bet) {
        player.setCash(bet);
    }

    public int calculateBet(int winType, int bet) {
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
