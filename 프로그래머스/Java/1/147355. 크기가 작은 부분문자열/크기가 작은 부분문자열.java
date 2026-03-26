class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int size = t.length();
        int str_size = p.length();
        
        for(int i=0; i<(size-(str_size-1)); i++) {
            if(Long.parseLong(t.substring(i, i+str_size))<=Long.parseLong(p))             {
                answer++;
            }
        }
        
        return answer;
    }
}