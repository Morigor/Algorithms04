import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositivNum() {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        SumArray obj = new SumArray();

        int actualResult = obj.sumArrayAlgo(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNum() {
        int[] numbers = {-7, -3};
        int expectedResult = -10;
        SumArray obj = new SumArray();

        int actualResult = obj.sumArrayAlgo(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testSumArrayHappyPathPositivNegativeNum() {
        int[] numbers = {-7, -3, 0, 1, 2, 3, 4, 5};
        int expectedResult = 5;
        SumArray obj = new SumArray();

        int actualResult = obj.sumArrayAlgo(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArrayMinMaxInteger() {
        int[] numbers = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int expectedResult = -1;
        SumArray obj = new SumArray();

        int actualResult = obj.sumArrayAlgo(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArrayEmptyArray() {
        int[] numbers = {};
        int expectedResult = 0;
        SumArray obj = new SumArray();

        int actualResult = obj.sumArrayAlgo(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArrayIndexWithSum() {
        int[] numbers = {0 + 4, 1, 2, 3, 4 - 1, 5 * 5};
        int expectedResult = 38;
        SumArray obj = new SumArray();

        int actualResult = obj.sumArrayAlgo(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
