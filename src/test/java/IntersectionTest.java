import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntersectionTest {

    @RepeatedTest(6)
    @Order(1)
    public void testIntersectionHappyPath() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};
        Intersection obj = new Intersection();

        int[] actualResult = obj.intersectionAlgo(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void testIntersectionHappyPathA() {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};
        Intersection obj = new Intersection();

        int[] actualResult = obj.intersectionAlgo(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testIntersectionHappyPathB() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};
        Intersection obj = new Intersection();

        int[] actualResult = obj.intersectionAlgo(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    @Order(4)
    public void testIntersectionHappyPathC() {
        int[] array1 = {0, 5, -6, 500, 5, 5, 0, 0};
        int[] array2 = {14, -6, -6, 0, 5, 0, 5, 0};
        int[] expectedResult = {0, 5, -6};
        Intersection obj = new Intersection();

        int[] actualResult = obj.intersectionAlgo(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionEmptyArray() {
        int[] array1 = {};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {};
        Intersection obj = new Intersection();

        int[] actualResult = obj.intersectionAlgo(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testIntersectionAllNumbersZero() {
        int[] array1 = {0, 0};
        int[] array2 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0};
        Intersection obj = new Intersection();

        int[] actualResult = obj.intersectionAlgo(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
