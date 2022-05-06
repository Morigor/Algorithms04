import org.junit.jupiter.api.*;

public class KthLargestTest {

    @Test
    public void testKthLargestHappyPathPositNum() {
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;
        KthLargest obj = new KthLargest();

        int actualResult = obj.kthLargestAlgo(numbers, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestHappyPathNegatNum() {
        int[] numbers = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int k = 5;
        int expectedResult = -5;
        KthLargest obj = new KthLargest();

        int actualResult = obj.kthLargestAlgo(numbers, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestEmptyArray() {
        int[] numbers = {};
        int k = 3;
        int expectedResult = Integer.MIN_VALUE;
        KthLargest obj = new KthLargest();

        int actualResult = obj.kthLargestAlgo(numbers, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestKisZero() {
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 0;
        int expectedResult = Integer.MIN_VALUE;
        KthLargest obj = new KthLargest();

        int actualResult = obj.kthLargestAlgo(numbers, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestKisOutOfBond() {
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 10;
        int expectedResult = Integer.MIN_VALUE;
        KthLargest obj = new KthLargest();

        int actualResult = obj.kthLargestAlgo(numbers, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
