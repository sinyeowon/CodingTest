import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.printf("%d\n%d\n%d\n%d\n%d", a+b, a-b, a*b, a/b, a%b);
    }
}