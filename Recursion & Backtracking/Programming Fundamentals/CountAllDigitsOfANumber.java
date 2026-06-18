public class CountAllDigitsOfANumber {
    public static void main(String[] args) {
        int result = countDigits(10);
        System.out.println(result);

        result = countDigits(100);
        System.out.println(result);

        result =countDigits(1000);
        System.out.println(result);

        result = countDigits(0000);
        System.out.println(result);
    }



    /*    
        BRUTE FORCE APPROACH
    */
    // static int countDigits(int number){
    //     int numCopy = number;
    //     int cnt = 0;

    //     while (numCopy != 0) {
    //         numCopy = numCopy / 10;
    //         cnt += 1;
    //     }

    //     return cnt;
    // }

    static int countDigits(int number){
        if(number == 0){
            return 1;
        }
        
        number = Math.abs(number);
        
        int cnt = (int)(Math.log10(number) + 1);
        return cnt;
    }



}
