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
            
            int[] freq = new int[26];
            for(int i = 0; i < n; i++){
                freq[s.charAt(i)-'a']++;
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < freq.length; i++) {
                if(freq[i] != 0 && freq[i] < min){
                    min = Math.min(freq[i], min);
                }
            }
            System.out.println(min);
        }
	}
}
