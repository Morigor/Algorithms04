import org.junit.jupiter.api.*;


    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NegativeOnTheRightTest {
    NegativeOnTheRight obj;

    @BeforeEach
    void setUp() {
        obj = new NegativeOnTheRight();
    }
    @Order(1)
    @Test

    public void testNegativeOnTheRightHappyPath() {
        int[] numbers = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        int[] actualResult = obj.negativeOnTheRightAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightAllNegative() {
        int[] numbers = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-4, -3, -7, -12, -5, -2, -9, -4, -12};

        int[] actualResult = obj.negativeOnTheRightAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightAllPositive() {
        int[] numbers = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] actualResult = obj.negativeOnTheRightAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRight() {
        int[] numbers = {-1, 0, -1, 0, -1, 0};
        int[] expectedResult = {0, 0, 0, -1, -1, -1};

        int[] actualResult = obj.negativeOnTheRightAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testNegativeOnTheRightEmptyArray() {
        int[] numbers = {};
        int[] expectedResult = {};

        int[] actualResult = obj.negativeOnTheRightAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
