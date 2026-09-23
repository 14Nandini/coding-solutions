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
            String s = sc.next();
            int a = 0, b = 0;
            for(char ch : s.toCharArray()){
                if(ch == 'a') a++;
                else b++;
            }
            if(a == 0 || b == 0) System.out.println(0);
            else if (a < b) System.out.println(a);
            else System.out.println(b);
        }
	}
}
