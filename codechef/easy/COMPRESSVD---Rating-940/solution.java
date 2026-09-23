import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Start with 1 because the first element is always kept
            int count = 1;
            for (int i = 1; i < n; i++) {
                // If the current element is different from the previous, 
                // it cannot be removed, so we count it.
                if (a[i] != a[i - 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}