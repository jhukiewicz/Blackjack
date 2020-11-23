package com.example.Players;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HumanPlayer extends Player {

    @Autowired
    public HumanPlayer() {
        super(2500, false);
    }

}
