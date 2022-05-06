public class NegativeOnTheRight {

    //  Task 13 /2  Написать алгоритм NegativeOnTheRight, который принимает на
    //              вход массив целых чисел, и возвращает массив,  в котором все
    //              негативные числа находятся во второй половине массива.
    //                 Пример:   {4, -3, 7, -12, 5, -2, 9, 4, 12}

    public int[] negativeOnTheRightAlgo(int[] numbers) {
        if(numbers.length > 0) {
            int j = 0;
            int[] negOnRight = new int[numbers.length];
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] > 0) {
                    negOnRight[j] = numbers[i];
                    j++;
                }
            }
            j = negOnRight.length - 1;
            for(int i = numbers.length - 1; i >=0 ; i--) {
                if(numbers[i] < 0) {
                    negOnRight[j] = numbers[i];
                    j--;
                }
            }
            return negOnRight;
        }
        return new int[0];
    }
}
