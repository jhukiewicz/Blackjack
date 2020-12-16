package com.example.GameLogic;

import com.example.Cards.Card;
import com.example.Players.HumanPlayer;
import com.example.Players.Player;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Slf4j
@Component
public class Game {

    private boolean isGameWon = false;
    private boolean push = false;
    private boolean playerBlackjack = false;
    private boolean dealerBlackjack = false;

    private int playerScore;
    private int dealerScore;
    private int currentBet;

    @Autowired
    Player humanPlayer;
    @Autowired
    Player dealer;
    @Autowired
    Bets bets;

    public void reset(){
        isGameWon=false;
        push=false;
        playerBlackjack = false;


        currentBet=0;
    }

//    public void placeABet(Player player, int bet){
//        currentBet=bets.placeABet(player,bet);
//    }
//
//    public int payOut(Player player){
//        int winType;
//        if (push){
//            winType=2;
//        }else if(isGameWon && playerBlackjack){
//            winType=1;
//        }else {
//            winType=0;
//        }
//
//        return bets.returnBet(player,winType,currentBet);
//    }

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
            if (player instanceof HumanPlayer) {
                playerBlackjack = true;
            }else {
                dealerBlackjack=true;
            }
            return true;
        }
        return false;
    }

    public void check(){

        if ((isBlackjack(humanPlayer) && !isBlackjack(dealer))
            || (playerScore>dealerScore)){
            isGameWon=true;
        }

        if (isBlackjack(humanPlayer) && isBlackjack(dealer) || playerScore==dealerScore){
            push=true;
        }
    }

    private int sumPoints(Player player){
        int score = 0;
        for (Card card : player.getCards()){
            score+=card.getPips();
        }
        return score;
    }

}
