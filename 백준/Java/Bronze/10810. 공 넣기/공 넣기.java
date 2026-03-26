import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int t=0; t<m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(int g=i-1; g<j; g++) {
                arr[g] = k;
            }
        }
        
        for(int i=0; i<n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}