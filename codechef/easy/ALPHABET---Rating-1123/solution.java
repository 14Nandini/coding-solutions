import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String known = sc.next();
        
        
        boolean[] res = new boolean[26];
        for(char ch : known.toCharArray()){
            res[ch - 'a'] = true;
        }
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            boolean isValid = true;
            for(char ch : s.toCharArray()){
                if(res[ch - 'a'] == false){ 
                    isValid = false;
                    break;
                }
            }
            if(isValid) System.out.println("Yes");
            else System.out.println("No");
        }
	}
}
