package com.example.GameLogic;

import com.example.Cards.Card;
import com.example.Players.Player;
import org.springframework.beans.factory.annotation.Autowired;

public class Game {


    private boolean isGameWon = false;
    private boolean push = false;
    private boolean blackjack;

    private int playerScore;

    private int dealerScore;

    @Autowired
    Player player;
    @Autowired
    Player dealer;


    private boolean isBlackjack(Player player){
        boolean isTen = false;
        boolean isAce = false;

        for (Card card: player.getCards()){
            if (card.getPips()==10){
                isTen=true;
            }
            if (card.getPips()==14){
                isAce=true;
            }
        }

        if (isAce && isTen){
            blackjack=true;
            return true;
        }
        return false;
    }

    public void check(){
        if ((isBlackjack(player) && !isBlackjack(dealer))
            || (playerScore>dealerScore)){
            isGameWon=true;
        }

        if (isBlackjack(player) && isBlackjack(dealer) || playerScore==dealerScore){
            push=true;
        }
    }




}
