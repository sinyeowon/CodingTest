import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String[] number = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        int total = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<number[j].length(); k++) {
                    if(s.charAt(i) == number[j].charAt(k)) {
                        total += j+1;
                        break;
                    }
                }
            }
        }
        
        System.out.print(total);
    }
}