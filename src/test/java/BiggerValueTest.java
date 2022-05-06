import org.junit.jupiter.api.*;

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {
    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositivNum() {
        int num1 = 3333;
        int num2 = 9999;
        int expectedResult = 9999;
        BiggerValue obj = new BiggerValue();

        int actualResult = obj.biggerValueAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegativeNum() {
        int num1 = -3333;
        int num2 = -9999;
        int expectedResult = -3333;
        BiggerValue obj = new BiggerValue();

        int actualResult = obj.biggerValueAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @RepeatedTest(5)
    public void testBiggerValueEqual() {
        int num1 = 3333;
        int num2 = 3333;
        int expectedResult = 3333;
        BiggerValue obj = new BiggerValue();

        int actualResult = obj.biggerValueAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBiggerValuePositAndNegatNum() {
        int num1 = -1;
        int num2 = 1;
        int expectedResult = 1;
        BiggerValue obj = new BiggerValue();

        int actualResult = obj.biggerValueAlgo(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
