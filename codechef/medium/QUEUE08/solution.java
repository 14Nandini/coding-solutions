import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            k = k % n;
            Deque<Integer> q = new ArrayDeque<>();
            for(int i = 0; i < n; i++) q.offerLast(sc.nextInt());
            for(int i = 0; i < k; i++){
                int val = q.pollFirst();
                q.addLast(val);
            }
            for(int val : q) System.out.print(val + " ");
            System.out.println();
        }
	}
}
