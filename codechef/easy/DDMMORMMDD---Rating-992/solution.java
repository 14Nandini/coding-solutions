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
		    int x = sc.nextInt();
		    String str = sc.next();
		    System.out.println(prize(str,x));
		}

	}
	static int prize(String s, int x){
	    int c = 0, n = 0, d = 0;
	    for(int i = 0; i < s.length(); i++){
	        char ch = s.charAt(i);
	        if(ch == 'C') c++;
	        else if (ch == 'N') n++;
	        else d++;
	    }
	    c = c * 2 + d;
	    n = n * 2 + d;
	    if(c > n) return 60 * x;
	    else if(c < n) return 40 * x;
	    else return 55 * x;
	}
}














