class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int num =0;
        int diff = 0;
        
        if (n<=m) {
            num = n;
            diff = m;
        } else {
            num = m;
            diff = n;
        }
        
        int max = 0;
        int min = 0;
        
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                if(diff % i == 0) {
                    max = i;
                }
            }
        }
        
        for(int i=1; i<=num; i++) {
            if ((diff*i) % num == 0) {
                min = diff*i;
                break;
            }
        }
        
        answer[0] = max;
        answer[1] = min;
        
        
        return answer;
    }
}