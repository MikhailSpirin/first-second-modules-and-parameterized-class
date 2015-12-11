package com.wix.spirinmikhail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by mikhails on 10.12.2015
 */

@RunWith(Theories.class)
public class Module2Test extends Assert {

    @DataPoint
    public static int[] data1 = new int[] { 3, 4, 7 };  //pass
    @DataPoint
    public static int[] data2 = new int[] { 1, 1, 2 };  //pass
    @DataPoint
    public static int[] data3 = new int[] { 8, 8, 8 };  //fail

    @Test
    public void testFirstTest() {
        assertEquals("Wrong answer", MainAdding.calculation(3, 4), 7);
    }

    @Test
    public void testSecond() {
        assertEquals("Wrong answer", MainAdding.calculation(1, 1), 2);
    }

    @Theory
    public void testParameterized(int testData[]) {
        assertEquals(testData[2], MainAdding.calculation(testData[0], testData[1]));
    }
}
