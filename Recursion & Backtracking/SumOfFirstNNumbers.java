public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int sum = recursiveSumOfNNumbers(10);
        System.out.println(sum);
    }

    static int recursiveSumOfNNumbers(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + recursiveSumOfNNumbers( n - 1);
        return sum;
    }

}
