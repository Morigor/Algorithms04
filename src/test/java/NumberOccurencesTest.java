import org.junit.jupiter.api.*;

public class NumberOccurencesTest {

    @Test
    public void testNumberOccurences() {
        int[] numbers = {0, 3, 3, 3, 3, 1, 5, 4, 2, 3, 2, 1, 4, 5, 3, 3, 3};
        int[][] expectedResult = {{0, 1}, {1, 2}, {2, 2}, {3, 8}, {4, 2}, {5, 2}};
        NumberOccurences obj = new NumberOccurences();

        int[][] actualResult = obj.numberOccurrencesAlgoritm(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
