/*
 * Created by IntelliJ IDEA.
 * User: Aviram Dayan
 * Date: 28/11/2017
 * Time: 09:54
 */
package bgu.tests.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestSimpleMath {

    @DataProvider(name = "dpForTestMultiplyBy2")
    private static Object[][] dpForTestMultiplyBy2() {
        return new Object[][]{
            new Object[]{0, 0},
            new Object[]{1, 2},
            new Object[]{2, 4},
            new Object[]{-1, -2}
        };
    }

    @Test(dataProvider = "dpForTestMultiplyBy2")
    public void testMultiplyBy2(int i, int expectedResult) {
        SimpleMath simpleMath = new SimpleMath();
        int multipliedBy2 = simpleMath.multiplyBy2(i);
        assertEquals(multipliedBy2, expectedResult);
    }
}