import org.junit.jupiter.api.*;

public class PeakElementTest {

    @Test
    public void testPeakElementHappyPathA() {
        int[] peakElement = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};
        PeakElement obj = new PeakElement();

        int[] acualResult = obj.peakElementAlgo(peakElement);

        Assertions.assertArrayEquals(expectedResult, acualResult);
    }

    @Test
    public void testPeakElementHappyPathB() {
        int[] peakElement = {0, 2, 7, 5, 1, 9, 23, 24};
        int[] expectedResult = {7, 24};
        PeakElement obj = new PeakElement();

        int[] acualResult = obj.peakElementAlgo(peakElement);

        Assertions.assertArrayEquals(expectedResult, acualResult);
    }
    @Test
    public void testPeakElementEmptyArray() {
        int[] peakElement = {};
        int[] expectedResult = {};
        PeakElement obj = new PeakElement();

        int[] acualResult = obj.peakElementAlgo(peakElement);

        Assertions.assertArrayEquals(expectedResult, acualResult);
    }

    @Test
    public void testPeakElementAllElementsZero() {
        int[] peakElement = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {};
        PeakElement obj = new PeakElement();

        int[] acualResult = obj.peakElementAlgo(peakElement);

        Assertions.assertArrayEquals(expectedResult, acualResult);
    }

    @Test
    public void testPeakElementAllElementsSame() {
        int[] peakElement = {12, 12, 12, 12, 12, 12, 12, 12};
        int[] expectedResult = {};
        PeakElement obj = new PeakElement();

        int[] acualResult = obj.peakElementAlgo(peakElement);

        Assertions.assertArrayEquals(expectedResult, acualResult);
    }


}
