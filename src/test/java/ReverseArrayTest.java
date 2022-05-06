import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {
    ReverseArray obj;

    @BeforeEach
    void setUp() {
        obj = new ReverseArray();
    }

    @Order(1)
    @Test
    public void testReverseArrayHappyPathA() {
        int[] numbers = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        int[] actualResult = obj.reverseArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseArrayHappyPathB() {
        int[] numbers = {-2, -7, -3, -10};
        int[] expectedResult = {-10, -3, -7, -2};

        int[] actualResult = obj.reverseArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testReverseArrayHappyPathC() {
        int[] numbers = {-2, -7, 0, 3, 10};
        int[] expectedResult = {10, 3, 0, -7, -2};

        int[] actualResult = obj.reverseArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @RepeatedTest(3)
    public void testReverseArrayEmptyArray() {
        int[] numbers = {};
        int[] expectedResult = {};

        int[] actualResult = obj.reverseArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayAlmostAllSame() {
        int[] numbers = {1, 1, 1, 1, 1, 121, 1, 1};
        int[] expectedResult = {1, 1, 121, 1, 1, 1, 1, 1};

        int[] actualResult = obj.reverseArrayAlgo(numbers);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
