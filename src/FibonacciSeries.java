public class FibonacciSeries {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        boolean isFibonacci = false;

        for (int i = 0; i < numbers.length - 2; i++) {

            if (numbers[i] + numbers[i + 1] == numbers[i + 2]) {
                isFibonacci = true;
            } else {
                isFibonacci = false;
                break;
            }
        }
        if (isFibonacci) {
            System.out.println("Fibonacci");
        } else {
            System.out.println("Not Fibonacci");
        }
    }
}
