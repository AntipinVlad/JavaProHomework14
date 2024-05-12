package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsCounterTest {
    GoodPairsCounter pairsCounter = new GoodPairsCounter();

    @Test
    public void numIdenticalPairsTest() {
        int[] nums = {1,2,3,1,1,3};
        int expected = 4;
        int result = pairsCounter.numIdenticalPairs(nums);
        Assert.assertEquals(expected, result);
    }
}
