import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 5};
        int[] indices = getSecondLargestIndex(arr);

        System.out.println(Arrays.toString(indices));
    }

    static int[] getSecondLargestIndex(int[] arr){
        
        int maxIndex = -1, secondMaxIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(maxIndex == -1 || arr[i] > arr[maxIndex]){
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if(arr[i] < arr[maxIndex] && (secondMaxIndex == -1 || arr[i] > arr[secondMaxIndex])){
                secondMaxIndex = i;
            }
        }

        return new int[]{maxIndex, secondMaxIndex}; 
    }
}
