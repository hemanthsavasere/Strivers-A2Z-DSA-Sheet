package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequenciesOfArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,1,4};
        coutingFrequencies(arr);
    }

    static void coutingFrequencies(int[] nums){
        HashMap<Integer, Integer> cntMap = new HashMap<>();

        for(int i : nums){
            cntMap.put(i, cntMap.getOrDefault(i, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : cntMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
