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
            long cost = sc.nextLong();
            long res = 0;
            int rPrev = 0;
            for(int i = 0; i < n; i++){
                int r = sc.nextInt();
                if(r == 1 || rPrev == 1){
                    res += cost;
                }
                rPrev = r;
            }
            System.out.println(res);
        }
	}
}
