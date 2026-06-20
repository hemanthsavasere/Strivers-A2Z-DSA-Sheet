public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 5, 4, 3, 2, 3, 4, 5};

        int largestIndex = getLargestElementIndex(arr);
        System.out.println(largestIndex + " " + arr[largestIndex]);
        
    }

    static int getLargestElementIndex (int[] arr){
        int maxIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(maxIndex == -1 || arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
