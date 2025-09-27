class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int number = 0;
        
        int real = x;
        
        while(x != 0) {
            number += (x % 10);
            
            x /= 10;
        }
        
        if (real % number == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}