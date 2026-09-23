import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            
            TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
            for(int num : a) set.add(num);
            int sum = set.pollFirst() + set.pollFirst();
            System.out.println(sum);
        }
    }
}
