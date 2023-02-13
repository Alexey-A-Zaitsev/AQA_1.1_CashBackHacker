package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldSuggest1() {

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSuggest0() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSuggest999IfAmountMore1000() {

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSuggest999IfAmountLess1000() {

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSuggest500IfAmountLess1000() {

        int actual = service.remain(500);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSuggest200IfAmountMore1000() {

        int actual = service.remain(2800);
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSuggest0IfTheAmountIsAMultipleOfTheBoundary() {

        int actual = service.remain(4000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}