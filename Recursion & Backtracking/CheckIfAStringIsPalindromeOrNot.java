public class CheckIfAStringIsPalindromeOrNot {
    public static void main(String[] args) {
        char[] str = "ABCDEF".toCharArray();
        char[] str2 = "ABCDCBA".toCharArray();

        boolean result = checkPallindrome(str, 0, str.length - 1);

        System.out.println(result);

        result = checkPallindrome(str2, 0, str2.length - 1);

         System.out.println(result);        
    }

    static boolean checkPallindrome(char[] str, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return true;
        }
        

        if(str[startIndex] != str[endIndex]){
            return false;
        }

        return checkPallindrome(str, startIndex + 1, endIndex - 1);
    }

}




