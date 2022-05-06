import org.junit.jupiter.api.*;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwoHappyPathA() {
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};
        SumOfTwo obj = new SumOfTwo();

        int[][] actualResult = obj.sumOfTwoAlgo(numbers, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoHappyPathB() {
        int[] numbers = {0, 4, -3, -7, 12, -5, 2, 9, 3, 12};
        int n = 12;
        int[][] expectedResult = {{0, 12}, {9, 3}};
        SumOfTwo obj = new SumOfTwo();

        int[][] actualResult = obj.sumOfTwoAlgo(numbers, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoBug() {
        int[] numbers = {12, 4, -3, -7, 0, -5, 1, 9, 3, 12};
        int n = 12;
        int[][] expectedResult = {{12, 0}, {0, 12}, {9, 3}};  //  средняя пара не должна быть
        SumOfTwo obj = new SumOfTwo();

        int[][] actualResult = obj.sumOfTwoAlgo(numbers, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
