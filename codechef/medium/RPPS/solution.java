import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        HashMap<String , Integer> hm = new HashMap<>();
        for(int i = 0; i < n-1; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1));
            String str = sb.toString();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        int c = 0;
        for(int val : hm.values()){
            if(val > 1) c++;
        }
        System.out.println(c);
	}
}
