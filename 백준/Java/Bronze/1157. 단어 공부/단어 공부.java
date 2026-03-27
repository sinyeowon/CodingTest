import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next().toUpperCase();
        int[] check = new int[26];
        
        for(int i=0; i<input.length(); i++) {
            ++check[input.charAt(i) - 'A'];
        }
        
        int max = 0;
        char result = '?';
        for(int i=0; i<26; i++) {
            if (check[i] > max) {
                max = check[i];
                result = (char)(i + 'A');
            } else if (check[i] == max) {
                result = '?';
            }
        }
        
        System.out.println(result);
        
    }
}