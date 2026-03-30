import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int b = sc.nextInt();
        
        int result = 0;
        for(int i=0; i<n.length(); i++) {
            char check = n.charAt(n.length()-(i+1));
            
            int value;
            if (check >= '0' && check <= '9') { // 숫자일 때
                value = check - '0'; // 진법을 숫자로 표현했을 때
            }
            else { // 영어일 때
                value = check - 'A' + 10;
            }
            
            result += Math.pow(b, i) * value;
        }
        
        System.out.print(result);
    }
}