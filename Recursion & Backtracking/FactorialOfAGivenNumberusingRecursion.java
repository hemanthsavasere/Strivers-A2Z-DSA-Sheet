public class FactorialOfAGivenNumberusingRecursion {
    public static void main(String[] args) {
        long factorialResult = factorial(10);
        System.out.println(factorialResult);
    }

    static long factorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }

        long factorial = N * factorial(N - 1);
        return factorial;
    }

}
