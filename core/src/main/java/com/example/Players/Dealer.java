package com.example.Players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dealer extends Player{

    @Autowired
    public Dealer() {
        super(50000, true);
    }
}
