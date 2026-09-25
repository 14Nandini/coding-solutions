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
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            if(canSort(n, a)) System.out.println("YES");
            else System.out.println("NO");
        }
	}
	private static boolean canSort(int n, int[] a){
	    Stack<Integer> st = new Stack<>();
	    int expectedNum = 1;
	    for(int num : a){
	        
	        if(num == expectedNum){
	            expectedNum++;
	            while(!st.isEmpty() && st.peek() == expectedNum){
    	            st.pop();
    	            expectedNum++;
	            }
	        }
	        else if(!st.isEmpty() && num > st.peek()){
	            return false;
	        }
	        else{
	            st.push(num);
	        }
	    }
	    return true;
	}
}
