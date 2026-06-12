public class Print1ToNUsingRecursion {
    public static void main(String[] args) {
        print1ToNUsingRecursion(10);
    }

    static void print1ToNUsingRecursion(int N){
        if(N == 0){
            return;
        }
        print1ToNUsingRecursion(N - 1);
        System.out.println(N);
    }
}
