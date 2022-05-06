import org.junit.jupiter.api.*;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAveHappyPathA() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveHappyPathB() {
        int[] numbers = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {-2, 2, 0};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEmptyArray() {
        int[] numbers = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndicesEqual() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;
        int[] expectedResult = {};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexOneBiggerThanTwo() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        int[] expectedResult = {};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexOneNegative() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -1;
        int index2 = 6;
        int[] expectedResult = {};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexTwoEqualArrayLength() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 8;
        int[] expectedResult = {};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveAllIndicesAreSame() {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0};
        int index1 = 0;
        int index2 = 6;
        int[] expectedResult = {0, 0, 0};
        MinMaxAve obj = new MinMaxAve();

        int[] actualResult = obj.maxMinAveAlgo(numbers, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
