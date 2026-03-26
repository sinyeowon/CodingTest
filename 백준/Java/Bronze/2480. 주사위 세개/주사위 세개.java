import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if ((a == b) && (b == c)) {
            System.out.println(10000 + a*1000);
        } else if ((a == b) || (b == c) || (c == a)) {
            if (a == b) {
                System.out.println(1000 + a*100);
            } else if (b == c) {
                System.out.println(1000 + b*100);
            } else {
                System.out.println(1000 + c*100);
            }
        } else {
            int large = 0;
            if (a > b) {
                if (a > c) {
                    large = a;
                } else {
                    large = c;
                }
            } else if (b > c) {
                if (b > a) {
                    large = b;
                } else {
                    large = a;
                }
            } else {
                if (c > b) {
                    large = c;
                } else {
                    large = b;
                }
            }
            System.out.println(large*100);
            
        }
    }
}