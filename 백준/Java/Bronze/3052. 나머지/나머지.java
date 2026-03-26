import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[42];
        
        for(int i=0; i<10; i++) {
            int n = sc.nextInt() % 42;
            check[n] = true;
        }
        int cnt = 0;
        for(int i=0; i<42; i++) {
            if(check[i]) {
                ++cnt;
            }
        }
        
        System.out.printf("%d", cnt);
    }
}