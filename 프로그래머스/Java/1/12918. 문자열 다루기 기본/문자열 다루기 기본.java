class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        
        if (arr.length == 4 || arr.length == 6) {
            for(int i = 0; i<arr.length; i++) {
                if(Character.isLetter(arr[i])) {
                    answer = false;
                    break;
                }
                
                answer = true;
            }
        } else {
            answer = false;
        }
    
        
        
        
        return answer;
    }
}