import org.junit.jupiter.api.*;
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MultipleOfThreeAndFiveTest {

        MultipleOfThreeAndFive obj;
        @BeforeEach
        void setUp() {
            obj = new MultipleOfThreeAndFive();
        }

        @Order(1)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathA() {
        int m = 15;
        String expectedResult = "Good Number";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathB() {
        int m = 21;
        String expectedResult = "Bad Number";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathC() {
        int m = 70;
        String expectedResult = "Poor Number";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }
    @Order(4)
    @RepeatedTest(5)
    @Test
    public void testMultipleOfThreeAndFiveNotSatisfyAnyCondition() {
        int m = 16;
        String expectedResult = "-1";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }
    @Test
    public void testMultipleOfThreeAndFiveZero() {
        int m = 0;
        String expectedResult = "Good Number";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOfThreeAndFiveNegativeNumber() {
        int m = -15;
        String expectedResult = "Good Number";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOfThreeAndFiveExtremeInteger() {
        int m = Integer.MIN_VALUE;
        String expectedResult = "-1";

        String actualResult = obj.multipleOfThreeAndFiveAlgo(m);

        Assertions.assertSame(expectedResult, actualResult);
    }
}
