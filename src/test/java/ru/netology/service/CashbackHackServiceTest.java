package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldSuggest1() {

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSuggest0() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSuggest999IfAmountMore1000() {

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSuggest999IfAmountLess1000() {

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSuggest500IfAmountLess1000() {

        int actual = service.remain(500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSuggest200IfAmountMore1000() {

        int actual = service.remain(2800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }
}

