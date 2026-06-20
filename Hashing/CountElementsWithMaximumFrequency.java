package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> cntMap = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;

        for(int i : nums){
            cntMap.put(i, cntMap.getOrDefault(i, 0) + 1);
            maxFreq = Math.max(cntMap.get(i), maxFreq);
        }

        int elementsCnt = 0;

        for(int key : cntMap.keySet()){
            if(cntMap.get(key) == maxFreq){
                elementsCnt += cntMap.get(key);
            }
        }

        return elementsCnt;
    }
    
}
