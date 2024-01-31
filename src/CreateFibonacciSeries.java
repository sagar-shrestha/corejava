public class CreateFibonacciSeries {

    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        System.out.println(n0);
        System.out.println(n1);
        System.out.println(n2);

        for (int i = 0; i <= 60; i++) {
            n0 = n1 + n2;
            n2 = n1;
            n1 = n0;
            System.out.println(n0);
        }
    }
}
