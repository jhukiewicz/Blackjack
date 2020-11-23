package com.example.Players;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Dealer.class)
class DealerTest {

    @Autowired
    Player player;

    @Test
    void getCash() {
        assertEquals(50000,player.getCash());
    }
}