import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        String a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String c = "";
        
        while (n>0) {
          
            c += a.charAt(n%b);
            n = n/b;
        }
        
        for(int i=c.length()-1; i>=0; i--) {
            System.out.print(c.charAt(i));
        }
        
    }
}