public class PrintAllDivisors {
    public static void main(String[] args) {
        printAllDivisors(28);
        printAllDivisors(100);

    }

    static void printAllDivisors(int num){
         for(int i = 1; i < (int)(Math.sqrt(num) + 1); i++){
            if(num % i == 0){
                int divisor = i;
                int otherDivisor = num / i;

                System.out.println(divisor);

                if(divisor != otherDivisor){
                    System.out.println(otherDivisor);
                }
            }

        }
    }
    
}
