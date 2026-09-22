import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        if(S == null || T == null) return;
        if(S.contains(T)) System.out.println("YES");
        else System.out.println("NO");
	}
}
