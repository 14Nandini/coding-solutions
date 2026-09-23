import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            String[] str = s.split("/");
            String r = "";
            int[] res = new int[str.length];
            for(int i = 0; i < str.length; i++){
                res[i] = Integer.parseInt(str[i]);
                if(1 <= res[i] && res[i] <= 31) {
                    if(res[i] <= 12) r = r + "MM/";
                    else r = r + "DD/";
                }
                else r = r + "YYYY";
            }
            String both = "MM/MM/YYYY";
            if(r.equals(both)) System.out.println("BOTH");
            else System.out.println(r);
        }
    }
}

// int first = Integer.parseInt(s.substring(0,2));
// int second = Integer.parseInt(s.substring(3,5));
            
// if(first < 12 && second < 12) System.out.println("BOTH");
// else if(first < 12) System.out.println("MM/DD/YYYY");
// else System.out.println("DD/MM/YYYY");
