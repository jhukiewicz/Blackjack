package com.example.GameLogic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageGenerator {

    public static final String PLACE_BETS = "game.placeBets";
    public static final String DEALER_WIN = "game.dealerWin";
    public static final String PLAYER_WIN = "game.playerWin";

    private final Game game;
    private final MessageSource messageSource;

    public MessageGenerator(Game game, MessageSource messageSource) {
        this.game = game;
        this.messageSource = messageSource;
    }

    public String getResultMessage(){
        game.check();
        if (game.isGameWon()){
            return getMessage(PLAYER_WIN,game.getBet());
        }
    }

    private String getMessage(String code, Object... args) {
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
}
