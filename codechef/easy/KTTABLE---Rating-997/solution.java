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
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            int[] b = new int[n];
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();
            int count = 0;
            if(b[0] <= a[0]) count++;
            for(int i = 1; i < n; i++){
                int d = a[i] - a[i - 1];
                if(b[i] <= d) count++;
            }
            System.out.println(count);
        }
	}
}
