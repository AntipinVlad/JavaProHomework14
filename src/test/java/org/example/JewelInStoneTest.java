package org.example;

import org.junit.Assert;
import org.junit.Test;

public class JewelInStoneTest {
    JewelInStone jewelInStone = new JewelInStone();

    @Test
    public void numJewelsInStonesOneLoopTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = jewelInStone.numJewelsInStonesOneLoop(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesCharArraysTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = jewelInStone.numJewelsInStonesCharArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void numJewelsInStonesTwoLoopsTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = jewelInStone.numJewelsInStonesCharArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }
}
