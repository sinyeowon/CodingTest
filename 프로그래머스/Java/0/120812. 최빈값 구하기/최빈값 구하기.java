import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mode = -1;
        boolean isDuplicate = false;
        
        for (int num : array) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            
            if (count > maxCount) {
                maxCount = count;
                mode = num;
                isDuplicate = false;
            } else if (count == maxCount) {
                if (num != mode) {
                    isDuplicate = true;
                }
            }
        }
        
        return isDuplicate ? -1 : mode;
    }
}