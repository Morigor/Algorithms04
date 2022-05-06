import org.junit.jupiter.api.*;

public class SortArrayTest {

    @Test
    public void testSortArrayHappyPathA() {
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};
        SortArray obj = new SortArray();

        int[] actualResult = obj.sortArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayHappyPathB() {
        int[] numbers = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-12, -12, -9, -7, -5, -4, -4, -3, -2};
        SortArray obj = new SortArray();

        int[] actualResult = obj.sortArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayHappyPathC() {
        int[] numbers = {-500, 0, 500, 84, -9, -84, 9};
        int[] expectedResult = {-500, -84, -9, 0, 9, 84, 500};
        SortArray obj = new SortArray();

        int[] actualResult = obj.sortArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmptyArray() {
        int[] numbers = {};
        int[] expectedResult = {};
        SortArray obj = new SortArray();

        int[] actualResult = obj.sortArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayAllSame() {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0, 0};
        SortArray obj = new SortArray();

        int[] actualResult = obj.sortArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
