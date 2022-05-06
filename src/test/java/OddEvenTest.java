import org.junit.jupiter.api.*;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPathOddNumber() {
        int number = 345;
        String expectedResult = "Odd";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenHappyPathZero() {
        int number = 0;
        String expectedResult = "Even";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenHappyPathEvenNum() {
        int number = 222222;
        String expectedResult = "Even";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenEvenNumberPlusOne() {
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenNegativeOddNumber() {
        int number = -345;
        String expectedResult = "Odd";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenNegativeEvenNumber() {
        int number = -222222;
        String expectedResult = "Even";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenDoubleZero() {
        int number = 00;
        String expectedResult = "Even";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddEvenOddNumberWithZeroStart() {
        int number = 0345;
        String expectedResult = "Odd";
        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgo(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
