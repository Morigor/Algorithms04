import java.util.Arrays;

public class SortArray {

    //  Task 12  Написать алгоритм SortArray, который принимает на вход массив
    //           целых чисел, и сортирует элементы массива в порядке возрастания.

    public int[] sortArrayAlgo(int[] number) {
//        if(number.length > 0) {                   /     это
//            Arrays.sort(number);                  /  самый простой
//        }                                         /     способ
//        return number;                            /

        if(number.length > 0) {
            int tempVer;
            for(int i = 0; i < number.length; i++) {
                for(int j = i + 1; j < number.length; j++) {
                    if(number[i] > number[j]) {
                        tempVer = number[i];
                        number[i] = number[j];
                        number[j] = tempVer;
                    }
                }
            }
            return number;
        }
        return new int[]{};
    }
}
