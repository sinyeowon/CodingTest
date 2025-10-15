class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        
        int[] answer = new int[len-1]; 
        
        
        int min = 1000;
        int cnt = 0;
        
        int idx = -1;
        
        if (len == 1) {
            return new int[]{-1};
        } else {
            for(int i = 0; i<len; i++) {
                if(arr[i]<min) {
                    min = arr[i];
                    idx = i;
                }
            }
            for(int i = 0; i<len; i++) {
                if(i == idx) {
                    continue;
                } else {
                    answer[cnt++] = arr[i];
                }
            }
        }
        
        
        
        return answer;
    }
}