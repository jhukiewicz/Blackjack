package com.example.console;

import com.example.Players.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Scanner;

public class ConsoleGame {

    @Autowired
    @Qualifier("player")
    Player player;

    @Autowired
    @Qualifier("dealer")
    Player dealer;


    public void start() {

        Scanner scanner = new Scanner(System.in);



    }

}
