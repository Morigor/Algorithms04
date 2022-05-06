import org.junit.jupiter.api.*;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualHappyPathEqual() {
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;
        AreNumbersEqual obj = new AreNumbersEqual();

        int actualResult = obj.areNumbersEqualAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathFirstNumNegative() {
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;
        AreNumbersEqual obj = new AreNumbersEqual();

        int actualResult = obj.areNumbersEqualAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathSecondNumNegative() {
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;
        AreNumbersEqual obj = new AreNumbersEqual();

        int actualResult = obj.areNumbersEqualAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
