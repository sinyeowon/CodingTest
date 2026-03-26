import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int total = input.nextInt();
        int num = input.nextInt();
        
        int rtotal = 0;
        
        for(int i=0; i<num; i++) {
            int price = input.nextInt();
            int item = input.nextInt();
            
            rtotal += price*item;
        }
        
        if (total == rtotal) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}