import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        for(int i=97; i<123; i++) {
            int cnt = 0;
            for(int j=0; j < s.length(); j++) {
                if(s.charAt(j) == ((char)i)) {
                    ++cnt;
                    System.out.printf("%d ", j);
                    break;
                }
            }
            if (cnt == 0) {
                System.out.print("-1 ");
            }
        }
    }
}