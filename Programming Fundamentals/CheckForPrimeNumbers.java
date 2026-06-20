public class CheckForPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(16));
        System.out.println(isPrime(36));
        System.out.println(isPrime(29));
    }

    static boolean isPrime(int num){
        
        if(num == 0 || num == 1){
            return false;
        }
        
        for(int i = 2; i < (int)(Math.sqrt(num) + 1); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
