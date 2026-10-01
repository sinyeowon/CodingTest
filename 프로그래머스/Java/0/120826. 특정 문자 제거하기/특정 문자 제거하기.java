class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            String current = my_string.substring(i, i + 1);
            
            if (!current.equals(letter)) {
                answer += current;
            }
        }
        
        return answer;
    }
}