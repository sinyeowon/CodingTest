import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        boolean[] check = new boolean[30];
        
        for(int i=0; i<28; i++) {
            int n = sc.nextInt();
            check[n-1] = true;
        }
        
        int[] num = new int[2];
        int n = 0;
        for(int i=0; i<30; i++) {
            if (!check[i]) {
                num[n++] = i+1;
            }
        }
        
        if (num[0] > num[1]) {
            System.out.printf("%d\n%d", num[1], num[0]);
        } else {
            System.out.printf("%d\n%d", num[0], num[1]);
        }
            

    }
}