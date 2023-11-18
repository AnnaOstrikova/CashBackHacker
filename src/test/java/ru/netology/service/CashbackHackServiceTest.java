package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainForLessThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainForMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainForThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}