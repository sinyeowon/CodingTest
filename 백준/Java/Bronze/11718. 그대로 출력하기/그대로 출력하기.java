import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = new String[100];
        int i = 0;
        while(sc.hasNext()) {
            input[i++] = sc.nextLine();
        }
        for(int j=0; j<i; j++) {
            System.out.printf("%s\n", input[j]);
        }
    }
}