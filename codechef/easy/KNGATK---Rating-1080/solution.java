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
        while (t-- > 0) {
                int N = sc.nextInt();
                
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;
                
                for (int i = 0; i < N; i++) {
                    int temp = sc.nextInt(); 
                    
                    if (temp < smallest) {
                        secondSmallest = smallest;
                        smallest = temp;
                    } else if (temp < secondSmallest && temp != smallest) {
                        secondSmallest = temp;
                    }
                }
                System.out.println(secondSmallest);
            }
	}
}


