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
            System.out.println(isValid(s) ? 1 : 0);
        }
	}
	
	private static boolean isValid(String s){
	    Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') st.push(ch);
            else if(ch == ')'){
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
	}
}
