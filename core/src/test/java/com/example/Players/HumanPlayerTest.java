package com.example.Players;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HumanPlayer.class)
class HumanPlayerTest {

    @Autowired
    Player player;

    @Test
    void getCash() {
        assertEquals(2500, player.getCash());
    }
}