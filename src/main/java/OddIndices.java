public class OddIndices {

    public double[] oddIndicesAlgo(double[] numbers) {
        if(numbers.length > 0) {
            double[] oddIndec = new double[numbers.length / 2];
            for(int i = 1, j = 0; i < numbers.length; i+=2) {
                oddIndec [j++] = numbers[i];
            }
            return oddIndec;
        }
        return new double[]{};
    }
}
