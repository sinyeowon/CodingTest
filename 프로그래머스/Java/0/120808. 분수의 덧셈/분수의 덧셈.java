class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        
        int gcd = 1;
        
        for (int i = 1; i <= numer3 && i <= denom3; i++) {
            if (numer3 % i == 0 && denom3 % i == 0) {
                gcd = i;
            }
        }

        numer3 /= gcd;
        denom3 /= gcd;

        int[] answer = {numer3, denom3};

        return answer;
    }
}