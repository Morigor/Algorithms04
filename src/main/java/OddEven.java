public class OddEven {

    public String oddEvenAlgo(int number) {
        if(number % 2 != 0) {
            return "Odd";
        } else if(number % 2 == 0) {
            return "Even";
        } else if(number > Integer.MAX_VALUE || number < Integer.MIN_VALUE){

        }
        return "Undefined";
    }
}
