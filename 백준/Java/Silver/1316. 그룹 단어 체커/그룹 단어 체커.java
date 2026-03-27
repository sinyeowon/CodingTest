import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++) {
            String s = sc.next();
            boolean[] check = new boolean[26];
            boolean result = true;
            for(int j=0; j<s.length(); j++) {
                if(j>0 && s.charAt(j) != s.charAt(j-1) && check[s.charAt(j)-'a'] == true) {
                        result = false;
                        break;
                }
                check[s.charAt(j) - 'a'] = true;
            }
            if (result) {
                cnt++;
            }
     
        }
        
        System.out.print(cnt);
    }
}