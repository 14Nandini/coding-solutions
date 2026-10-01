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
            int x = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int res = 0;
            for(int i = n-1; i >= 0; i--){
                if(a[i] < x){
                    res = i + 1;
                    break;
                }
            }
            System.out.println(res);
        }
	}
}
