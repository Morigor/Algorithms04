import org.junit.jupiter.api.*;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPathIntPositNegatNumbers() {
        double[] numbers = {-45, 590, 234, 985, 12, 68};
        double[] expectedResult = {590, 985, 68};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesHappyPathDoublePositNegatNumbers() {
        double[] numbers = {-45.4, 0, 15.8, 234.0, 985.43, 12.9, 68, 12, 15, 23};
        double[] expectedResult = {0, 234.0, 12.9, 12, 23};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesHappyPathDoubleEmptyArray() {
        double[] numbers = {};
        double[] expectedResult = {};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesDifferentNumbers() {
        double[] numbers = {23-5, Double.MAX_VALUE + 5, 23.5, 11-76, -100000000000000000000000000000.0, 200};
        double[] expectedResult = {Double.MAX_VALUE + 5, 11-76, 200};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesNegativeResultOne() {
        double[] numbers = {-45, 590, 234, 985, 12, 68};
        double[] expectedResult = {-45, 590, 985, 68};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesNegativeResultTwo() {
        double[] numbers = {-45, 590, 234, 985, 12, 68};
        double[] expectedResult = {-45, 985, 68};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesOnlyOneIndexIncome() {
        double[] numbers = {23};
        double[] expectedResult = {};
        OddIndices obj = new OddIndices();

        double[] actualResult = obj.oddIndicesAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}
