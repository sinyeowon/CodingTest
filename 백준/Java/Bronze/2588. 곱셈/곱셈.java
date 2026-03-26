import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        int c = a * (b%10);
        int d = a * ((b%100)/10);
        int e = a * (b/100);
        int f = a * b;
                     
        System.out.printf("%d\n%d\n%d\n%d", c, d, e, f);
    }
}