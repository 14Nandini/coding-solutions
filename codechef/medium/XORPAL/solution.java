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
            String s = sc.next();
            System.out.println(isPalindrome(n, s)? "YES" : "NO");
        }
	}
	private static boolean isPalindrome(int n, String s){
	    int zc = 0, oc = 0;
	    for(char ch : s.toCharArray()){
	        if(ch == '0') zc++;
	        else oc++;
	    }
	    if(zc == oc) return true;
	    if(zc == 0 || oc == 0) return true;
	    if(zc % 2 == 0 && (oc % 2 != 0 || oc == 0)) return true;
	    if(oc % 2 == 0 && (zc % 2 != 0 || zc == 0)) return true;
	    return false;
	}
}
