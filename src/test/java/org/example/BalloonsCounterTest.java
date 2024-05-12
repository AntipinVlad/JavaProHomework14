package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BalloonsCounterTest {
    BalloonsCounter balloonsCounter = new BalloonsCounter();

    @Test
    public void maxNumberOfBalloonsTest() {
        String text = "loonbalxballpoon";
        int expected = 2;
        int result = balloonsCounter.maxNumberOfBalloons(text);
        Assert.assertEquals(expected, result);
    }
}
