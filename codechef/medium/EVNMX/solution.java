import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(!dq.isEmpty() && dq.peekFirst() < i-k+1) dq.pollFirst();
            if(a[i] % 2 == 0) dq.addLast(i);
            if(i >= k - 1){
                if(!dq.isEmpty())
                    sb.append(a[dq.peekFirst()]).append(" ");
                else sb.append("-1 ");
            }
        }
        System.out.println(sb.toString().trim());
	}
}
