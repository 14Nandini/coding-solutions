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
        
        while (t-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            
            int min = (u * u) - (2 * a * s);
            int max = v * v;
            
            if (min <= max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
