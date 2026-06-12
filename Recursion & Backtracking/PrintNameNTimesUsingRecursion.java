public class PrintNameNTimesUsingRecursion{
    
    public static void main(String[] args) {
        printNameNTimesRecursively(10, "Suhe");
    }

    static void printNameNTimesRecursively(int n, String name){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printNameNTimesRecursively(n - 1, name);
    }
}