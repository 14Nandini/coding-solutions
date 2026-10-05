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
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            } 
            boolean invalid = false;
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                if(hm.containsKey(num)){
                    invalid = true;
                }
            }
            if(invalid) System.out.println("No");
            else System.out.println("Yes");
        }
	}
}
