import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();
            int c = 0;
            for(char ch : s.toCharArray()){
                if(ch == '1') c++;
            }
            for(char ch : r.toCharArray()){
                if(ch == '1') c++;
            }
            if(c % 2 == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
