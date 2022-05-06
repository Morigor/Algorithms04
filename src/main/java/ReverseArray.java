import java.util.Arrays;

public class ReverseArray {
    //  Task 11 Написать алгоритм ReverseArray, который принимает на вход массив
    //          целых чисел, и возвращает “перевернутый” массив.
    public int[] reverseArrayAlgo(int[] numbers) {
        if(numbers.length > 0) {
            int[] reverseArr = new int[numbers.length];
            for(int i = 0, j = reverseArr.length - 1; i < numbers.length; i++) {
                reverseArr[j] = numbers[i];
                j--;
            }
            return reverseArr;
        }
        return new int[]{};
    }
}
