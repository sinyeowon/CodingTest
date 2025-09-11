class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int x = 1;
        
        while (n % x != 1) {
            x = x + 1;
        }
        
        answer = x;
        
        return answer;
    }
}