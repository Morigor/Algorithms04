import java.util.Arrays;

public class KthLargest {


    //  Task 13  Написать алгоритм KthLargest, который принимает на вход массив
    //           целых чисел и число k, и возвращает k-тый максимальный элемент.
//                Test Data:
//                ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
//                 (12 и 12 - первый и второй самые большие элементы)

    public int kthLargestAlgo(int[] numbers, int k) {

        if(numbers.length > 0 && k > 0 && k <= numbers.length) {
//            Arrays.sort(numbers);
            int temp;
            for(int i = 0; i < numbers.length; i++) {
                for(int j = i + 1; j < numbers.length; j++) {
                    if(numbers[i] > numbers[j]) {
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            return numbers[numbers.length - k];
        } else {
            return Integer.MIN_VALUE;
        }
    }


}
