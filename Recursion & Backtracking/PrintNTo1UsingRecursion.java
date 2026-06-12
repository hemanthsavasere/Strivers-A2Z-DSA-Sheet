public class PrintNTo1UsingRecursion {
    public static void main(String[] args) {
        printNTo1UsingRecursion(10);
    }

    static void printNTo1UsingRecursion(int N){
        if(N == 0){
            return;
        }
        System.out.println(N);
        printNTo1UsingRecursion(N - 1);  
    }
}
