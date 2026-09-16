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
            boolean fail = false;
            for(int i = 0; i < s.length(); i += 2){
                if(s.charAt(i) == s.charAt(i+1)){
                    fail = true;
                    break;
                }
            }
            if(fail) System.out.println("no");
            else System.out.println("yes");
        }
	}
}
