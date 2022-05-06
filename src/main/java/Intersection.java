import java.util.Arrays;

public class Intersection {

    //  Task 9  Написать алгоритм Intersection, который принимает на вход 2
    //          массива целых чисел и возвращает массив общих элементов.

    public int[] intersectionAlgo(int[] array1, int[] array2) {      //  {1, 2, 1, 4, 5, 2, 89}, {8, 9, 8, 4, 2, 8, 9}
        if (array1.length > 0 && array2.length > 0) {

            for (int i = 0; i < array1.length; i++) {           //  {1, 2, Int, 4, 5, Int, 89}
                for (int j = i + 1; j < array1.length; j++) {
                    if (array1[i] == array1[j] && array1[i] != Integer.MIN_VALUE) {
                        array1[j] = Integer.MIN_VALUE;
                    }
                }
            }               ///
            for (int i = 0; i < array2.length; i++) {         //  {8, 9, Int, 4, 2, Int, Int}
                for (int j = i + 1; j < array2.length; j++) {
                    if (array2[i] == array2[j] && array2[i] != Integer.MIN_VALUE) {
                        array2[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < array1.length; i++) {       //  {1, 2, Int, 4, 5, Int, 89}
                for (int j = 0; j < array2.length; j++) {      //  {8, 9, Int, 4, 2, Int, Int}
                    if (array1[i] == array2[j] && array1[i] != Integer.MIN_VALUE) {
                        count++;
                        break;
                    }
                }
            }
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < array1.length; i++) {     //  {1, 2, Int, 4, 5, Int, 89}
                for (int j = 0; j < array2.length; j++) {    //  {8, 9, Int, 4, 2, Int, Int}
                    if (array1[i] == array2[j] && array1[i] != Integer.MIN_VALUE) {
                        result[count] = array1[i];
                        count++;
                        break;
                    }
                }
            }
            return result;

        }
        return new int[]{};
    }
}
