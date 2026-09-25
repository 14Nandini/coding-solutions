# DTS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Divide The String

You are given an integer $N$ and a string $S$, whose length is $N$. Your task is to split the string $S$ into $k$ consecutive substrings of the same length, so that the splitting is magical, while maximizing the $k$.

We call a splitting magical if all of the substrings are anagrams of each other. We say that two string $A$ and $B$ are anagrams of each other if we can rearrange the characters of the string $A$ so that it becomes equal to string $B$.

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of a single line of input, an integer $N$ and a string $S$.
### Output Format

For each testcase, output in a single line maximal possible value of $k$. It can be showed that the answer always exists.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- Sum of $N$ over all test cases does not exceed $2\cdot10^5$
### Subtasks
- 30 points : Sum of $N$ over all test cases does not exceed $2000$
- 70 points : original constraints
### Sample 1:
Input
Output

```
3
6 abbaab
4 aaaa
6 abcdef
```

```
3
4
1
```

### Explanation:

In the first test case, it is optimal to split the string into $ab$, $ba$ and $ab$ since they are all anagrams of (for example) $ab$.

In the second test case, it is optimal to split the string into $a$, $a$, $a$, $a$.

In the third test case, the string cannot be split into more than one component, which is the string itself $abcdef$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T17:28:10.304Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/DTS)