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
            ArrayList<Integer> al = new ArrayList<>();
            int c = 0;
            for(int i = 0; i < n; i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                if(l == r){ 
                    al.add(l);
                    c++;
                }
                else {
                    for(int j = l; j < r; j++){
                        if(al.contains(j)) continue;
                    }
                }
            }
            Collections.sort(al);
            System.out.println(c);
            for(int val : al) System.out.println(val);
        }
	}
}
