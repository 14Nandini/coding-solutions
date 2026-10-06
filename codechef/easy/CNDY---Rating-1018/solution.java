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
            int[] a = new int[2*n];
            for(int i = 0; i < 2*n; i++) a[i] = sc.nextInt();
            
            HashMap<Integer, Integer> hm = new HashMap<>();

            boolean invalid = false;
            for(int i = 0; i < 2*n; i++){
                hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
                if(hm.get(a[i]) > 2){
                    invalid = true;
                    break;
                }
            }
            if(invalid) System.out.println("No");
            else System.out.println("Yes");
        }
	}
}
