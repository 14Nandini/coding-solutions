import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int om_cnt = 0, om_max = 0, addy_cnt = 0, addy_max = 0;
            for(int i = 0; i < n; i++){
                if(a[i] > 0){
                    om_cnt++;
                    om_max = Math.max(om_max, om_cnt);
                }
                else om_cnt = 0;
            
            }
            for(int i = 0; i < n; i++){
                if(b[i] > 0){
                    addy_cnt++;
                    addy_max = Math.max(addy_cnt, addy_max);
                }
                else addy_cnt = 0;
            }
            if(om_max > addy_max) System.out.println("Om");
            else if(addy_max > om_max) System.out.println("Addy");
            else System.out.println("Draw");
        }
        // Your code goes here
        
    }
}
