public class SumArray {

    public int sumArrayAlgo(int[] numbers) {
        if(numbers.length > 0) {
            int sum = 0;
            for(int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            return sum;
        }
        return 0;
    }
}
