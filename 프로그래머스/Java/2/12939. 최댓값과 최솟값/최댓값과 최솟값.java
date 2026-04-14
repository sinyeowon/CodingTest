class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int min, max;
        
        min = Integer.parseInt(arr[0]);
        max = Integer.parseInt(arr[0]);
        
        for(int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            
            if (n < min) min = n; 
            if (n > max) max = n;
        }
        
        answer = min + " " + max;
        
        
        return answer;
    }
}