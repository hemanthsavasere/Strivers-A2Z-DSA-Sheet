public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(0));
        System.out.println(isPalindromeNumber(1));
        System.out.println(isPalindromeNumber(2));
        System.out.println(isPalindromeNumber(3));
        System.out.println(isPalindromeNumber(4));

        System.out.println(isPalindromeNumber(101));
        System.out.println(isPalindromeNumber(11211));
        System.out.println(isPalindromeNumber(102345));
    }

    static boolean isPalindromeNumber(int number){

        number =  Math.abs(number);
        int reversedNum = reverseNumber(number);
        
        return reversedNum == number;
    }

    static int reverseNumber(int num){
        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num = num / 10;
        }

        return reversed;
    }

}
