import java.util.Arrays;

public class ReverseAnArrayRecursively {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        int[] reversed = new int[arr.length];

        recursiveReverseArray(arr, reversed, 0);

        System.out.println(Arrays.toString(reversed));
    }

    static void recursiveReverseArray(int[] arr, int[] reversed, int index) {
        if (index == arr.length) {
            return;
        }
        reversed[arr.length - 1 - index] = arr[index];
        recursiveReverseArray(arr, reversed, index + 1);
    }

}
