public class PeakElement {

    //  Task 10  Написать алгоритм PeakElement,  который принимает на вход
    //           массив целых чисел и возвращает значения пиковых элементов
    //           (элементы, которые больше своих соседей).

    public int[] peakElementAlgo(int[] numbers) {
        if (numbers.length > 0) {
            int count = 0;
            if (numbers[0] > numbers[1]) {
                count++;
            }
            if (numbers[numbers.length - 1] > numbers[numbers.length - 2]) {
                count++;
            }
            for (int i = 1; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                    count++;
                }
            }
            int[] peakElem = new int[count];
            count = 0;
            if (numbers[0] > numbers[1]) {
                peakElem[count] = numbers[0];
                count++;
            }
            if (numbers[numbers.length - 1] > numbers[numbers.length - 2]) {
                peakElem[peakElem.length - 1] = numbers[numbers.length - 1];
            }
            for (int i = 1; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                    peakElem[count] = numbers[i];
                    count++;
                }
            }
            return peakElem;
        }
        return new int[]{};
    }
}