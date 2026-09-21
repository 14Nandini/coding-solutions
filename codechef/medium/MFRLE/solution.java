import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        char maxChar = ' ';
        int maxFreq = -1;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.print(maxChar);
	}
}
