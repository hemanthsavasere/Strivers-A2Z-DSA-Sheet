public class AmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(100));
    }

    static boolean isArmstrongNumber(long num){
        
        int pow = (int)(Math.log10(num) + 1);
        long temp = num;
        long result = 0;

        while (num != 0) {
            long digit = num % 10;
            num /= 10;
            result += (int)(Math.pow(digit, pow));
        }
        
        return result == temp;
    }
    
}
