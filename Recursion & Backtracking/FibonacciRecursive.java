public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(10));
        System.out.println(recursiveFibonacci(20));
    }

    static int recursiveFibonacci(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
