import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int repeat = n/4;
        
        for(int i=0; i<repeat; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}