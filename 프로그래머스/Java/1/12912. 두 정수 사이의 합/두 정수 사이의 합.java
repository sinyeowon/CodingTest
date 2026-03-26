class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a <= b) {
            while(a != b) {
            answer += a;
            
            a++;
            }
        
            answer += b;
        }
        else {
            while (a != b) {
                answer += b;
                b++;
            }
            
            answer += a;
        }
        
        return answer;
    }
}