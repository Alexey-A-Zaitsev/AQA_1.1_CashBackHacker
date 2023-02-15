package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    // tests JUnit4
    @org.junit.Test
    public void shouldSuggest1() {

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }


    @org.junit.Test
    public void shouldSuggest0() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggest999IfAmountMore1000() {

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggest999IfAmountLess1000() {

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggest500IfAmountLess1000() {

        int actual = service.remain(500);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggest200IfAmountMore1000() {

        int actual = service.remain(2800);
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggest0IfTheAmountIsAMultipleOfTheBoundary() {

        int actual = service.remain(4000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    // tests JUnit Jupiter

    @org.junit.jupiter.api.Test
    public void shouldSuggest1Jupiter() {

        int actual = service.remain(999);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggest0Jupiter() {

        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggest999IfAmountMore1000Jupiter() {

        int actual = service.remain(1001);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggest999IfAmountLess1000Jupiter() {

        int actual = service.remain(1);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggest500IfAmountLess1000Jupiter() {

        int actual = service.remain(500);
        int expected = 500;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggest200IfAmountMore1000Jupiter() {

        int actual = service.remain(2800);
        int expected = 200;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggest0IfTheAmountIsAMultipleOfTheBoundaryJupiter() {

        int actual = service.remain(4000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}