public class ReverseANumber {
    public static void main(String[] args) {
        int result = reverseNumber(100);
        System.out.println(result);

        result = reverseNumber(1000);
        System.out.println(result);

        result = reverseNumber(12345);
        System.out.println(result);

        result = reverseNumber(0000);
        System.out.println(result);
    }

    static int reverseNumber(int number){

        boolean isNegative = number < 0;

        int copy = Math.abs(number);
        int reversed = 0;

        while(copy != 0){
            int digit = copy % 10;
            reversed = reversed * 10 + digit;

            copy /= 10;
        }

        if(isNegative){
            reversed *= -1;
        }
        
        return reversed;
    }
}
