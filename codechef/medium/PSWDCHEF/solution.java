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
            boolean hasLower = false, hasUpper = false, hasSpcl = false;
            for(char ch : s.toCharArray()){
                if(Character.isLowerCase(ch)) hasLower = true;
                else if(Character.isUpperCase(ch)) hasUpper = true;
                else hasSpcl = true;
            }
            int c = 0;
            if(!hasLower) c++;
            if(!hasUpper) c++;
            if(!hasSpcl) c++;
            int len = Math.max(0, 8 - s.length());
            System.out.println(Math.max(len, c));
        }
	}
}
