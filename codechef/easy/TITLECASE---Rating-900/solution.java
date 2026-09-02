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
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            convert(s);
        }
	}
	static void convert(String s){
	    String[] arr = s.trim().split("\\s+");
	    StringBuilder res = new StringBuilder();
	    for(String st : arr){
	        boolean t = true;
	        for(int i = 0; i < st.length(); i++){
	           if(!Character.isUpperCase(st.charAt(i))){
	               t = false;
	               break;
	           }
	        }
	        String temp;
	        if(t) temp = st;
	        else{
	            temp = Character.toUpperCase(st.charAt(0)) + st.substring(1).toLowerCase();
	        }
    	    if (res.length() > 0) res.append(" ");
            res.append(temp);
	    }
	    System.out.println(res.toString());
	}
}
