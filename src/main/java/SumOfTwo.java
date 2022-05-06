public class SumOfTwo {

    //  Task 14  Написать алгоритм SumOfTwo, который принимает на вход массив
    //           целых чисел,  и число n. Алгоритм  возвращает пары элементов,
    //           которые в сумме дают число n.
    //           Пример: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}

    public int[][] sumOfTwoAlgo(int[] numbers, int n) {
        if(numbers.length > 0) {
            int[] duplicate = new int[numbers.length];
            for(int i = 0; i < numbers.length; i++){
                duplicate[i] = numbers[i];
            }
            int count = 0;
            for(int i = 0; i < numbers.length; i++) {
                for(int j = i + 1; j < numbers.length; j++) {
                    if((numbers[i] + numbers[j]) == n) {
                        count++;
                        numbers[i] = Integer.MIN_VALUE;
                    }
                }
            }
            int[][] sumOfTwo = new int[count][2];
            count = 0;
            for(int i = 0; i < duplicate.length; i++) {
                for(int j = i + 1; j < duplicate.length; j++) {
                    if((duplicate[i] + duplicate[j]) == n) {
                        sumOfTwo[count][0] = duplicate[i];
                        sumOfTwo[count][1] = duplicate[j];
                        count++;
                        duplicate[i] = Integer.MIN_VALUE;
                    }
                }
            }
            return sumOfTwo;
        }
        return null;
    }
}
   ///  {0, 4, -3, -7, 12, -5, 2, 9, 3, 12}    {{0, 12}, {0, 12}, {9, 3}}