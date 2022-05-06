public class MinMaxAve {

    //  TASK 8 Написать алгоритм MinMaxAve, который принимает массив чисел int[]
    //         и 2 значения индексов. Алгоритм возвращает массив, который содержит
    //         минимальное значение, максимальное значение,  и среднее среди всех
    //         значений между 2-мя индексами.

    public int[] maxMinAveAlgo(int[] numbers, int index1, int index2) {
        if(numbers.length > 0 && index2 > index1 && index1 >= 0 &&
                index2 < numbers.length) {
            int[] tempResult = new int[index2 - index1 + 1];
            for (int i = index1, j = 0; i <= index2; i++) {
                tempResult[j] = numbers[i];
                j++;
            }
            return new int[]{minNumber(tempResult), maxNumber(tempResult),
                    averageNumber(tempResult)};
        }
        return new int[]{};
    }

    public static int minNumber(int[] findMin) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < findMin.length; i++) {
            if(findMin[i] < min) {
                min = findMin[i];
            }
        }
        return min;
    }
    public static int maxNumber(int[] findMax) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < findMax.length; i++) {
            if(findMax[i] > max) {
                max = findMax[i];
            }
        }
        return max;
    }

    public static int averageNumber(int[] findAver) {
        int sum = 0;
        for(int i = 0; i < findAver.length; i++) {
            sum = sum + findAver[i];
        }
        return sum / findAver.length;
    }
}
