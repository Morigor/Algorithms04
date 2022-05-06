import org.junit.jupiter.api.*;
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {
    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositNum() {
        int number = 555;
        IsPositiveNumber obj = new IsPositiveNumber();

        boolean actualResult = obj.isPositiveNumberAlgo(number);

        Assertions.assertTrue(actualResult);
    }
    @RepeatedTest(3)
    @Test
    public void testIsPositiveNumberHappyPathNegativeNum() {
        int number = -555;
        IsPositiveNumber obj = new IsPositiveNumber();

        boolean actualResult = obj.isPositiveNumberAlgo(number);

        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testIsPositiveNumberZero() {
        int number = 0;
        IsPositiveNumber obj = new IsPositiveNumber();

        boolean actualResult = obj.isPositiveNumberAlgo(number);

        Assertions.assertTrue(actualResult);
    }
    @Test
    public void testIsPositiveNumberUnexpectedNumberA() {
        int number = 005;
        IsPositiveNumber obj = new IsPositiveNumber();

        boolean actualResult = obj.isPositiveNumberAlgo(number);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testIsPositiveNumberUnexpectedNumberB() {
        int number = -25 + 30;
        IsPositiveNumber obj = new IsPositiveNumber();

        boolean actualResult = obj.isPositiveNumberAlgo(number);

        Assertions.assertTrue(actualResult);
    }
    @Test
    public void testIsPositiveNumberUnexpectedNumberC() {
        int number = Integer.MAX_VALUE + 1;
        IsPositiveNumber obj = new IsPositiveNumber();

        boolean actualResult = obj.isPositiveNumberAlgo(number);

        Assertions.assertFalse(actualResult);
    }
}
