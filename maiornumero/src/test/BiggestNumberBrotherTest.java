package test;


import maiornumero.BiggestNumberBrother;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiggestNumberBrotherTest {

    @Test
    public void BiggestNumberBrother() {
        BiggestNumberBrother biggestNumber = new BiggestNumberBrother();

        int biggestMiddle = biggestNumber.biggestNumberBrother(213);
        assertEquals(biggestMiddle, 321);

        int biggestHigherInt = biggestNumber.biggestNumberBrother(2147483647);
        assertEquals(biggestHigherInt, 0);

        int biggestLimitInferior = biggestNumber.biggestNumberBrother(0);
        assertEquals(biggestLimitInferior, 0);

        int biggestLimitHigher = biggestNumber.biggestNumberBrother(100000000);
        assertEquals(biggestLimitHigher, 100000000);

        int biggestLimitHigherExceeded = biggestNumber.biggestNumberBrother(100000001);
        assertEquals(biggestLimitHigherExceeded, -1);

        int biggestNegativeNumber = biggestNumber.biggestNumberBrother(-1);
        assertEquals(biggestNegativeNumber, 0);
    }
}

