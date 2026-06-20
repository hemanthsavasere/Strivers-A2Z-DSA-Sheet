public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(gcd(5, 10));
        System.out.println(gcd(5, 11));
        System.out.println(gcd(15, 10));
        System.out.println(gcd(4, 18));
    }

    static int gcd (int num1, int num2){
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while(num1 != 0){
            int rem = num2 % num1;
            num2 = num1;
            num1 = rem;
        }

        return num2;
    }

}