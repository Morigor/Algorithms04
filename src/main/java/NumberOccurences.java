import java.util.Arrays;

public class NumberOccurences {

    //  Task 15  Написать алгоритм NumberOccurrences,  который принимает на вход
    //           массив целых чисел,  и возвращает массив пар
    //           {число, сколько раз число встречается в массиве}.

//    public int[][] numberOccurencesAlgo(int[] numbers) {
//        if (numbers.length > 0) {
//            int count = 0;
//            int[] duplicate = new int[numbers.length];
//            Arrays.sort(duplicate);
//            for(int i = 0; i < numbers.length; i++) {
//                duplicate[i] = numbers[i];
//            }
//            for(int i = 0; i < numbers.length; i++) {
//                for(int j = i + 1; j < numbers.length; j++) {
//                    if(numbers[i] == numbers[j] &&
//                            numbers[i] != Integer.MIN_VALUE) {
//                        numbers[j] = Integer.MIN_VALUE;
//                    }
//                }
//            }
//            for(int i = 0; i < numbers.length; i++) {
//                if(numbers[i] != Integer.MIN_VALUE) {
//                    count++;
//                }
//            }
//            int[][] occurence = new int[count][2];
//            count = 0;
//            for(int i = 0; i < duplicate.length; i++) {
//                for(int j = i, k = 0; j < duplicate.length; j++) {
//                    if(duplicate[i] == duplicate[j] &&
//                            duplicate[i] != Integer.MIN_VALUE) {
//                        occurence[count][0] = duplicate[i];
//                        occurence[count][1] = k++;
//                        duplicate[j] = Integer.MIN_VALUE;
//                        count++;
//                    }
//                }
//            }
//            return occurence;
//        }
//        return new int[][]{};
//    }
//}



    public int[][] numberOccurrencesAlgoritm(int[] a) {
        if (a.length > 0) {

            Arrays.sort(a);
            int number = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == a[i]) {
                        break;
                    } else {
                        number++;
                        break;
                    }
                }
            }

            int[][] result = new int[number + 1][2];

            number = 0;
            int count = 0;

            for (int i = 0; i < a.length; i += count) {
                result[number][0] = a[i];
                count = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[i]) {
                        count++;
                    }
                }
                result[number][1] = count;
                number++;
            }

            return result;
        }

        return new int[][]{};
    }
}

