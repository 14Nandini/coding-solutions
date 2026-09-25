# STKSORT - Rating 1400

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Stack Sort

You have an array $A$ of integers of size $N$, an array $B$ (initially empty) and a stack $S$ (initially empty). You are allowed to do the following operations :

- Take the first element of array $A$ and push it into $S$ and remove it from $A$.
- Take the top element from stack $S$, append it to the end of array $B$ and remove it from $S$.

You have to tell if it possible to move all the elements of array $A$ to array $B$ using the above operations such that finally the array $B$ is sorted in ascending order.

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- First line of each testcase contains a single integer $N$.
- Second line of each testcase contains $N$ distinct integers : $A_1, A_2... A_N$.
### Output Format

For each testcase, if it possible to move all the elements of array $A$ to array $B$ using the above operations such that finally, the array $B$ is sorted in ascending order, print "YES" (without quotes), else print "NO" (without quotes).

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq N$
- $A_i = A_j$ if and only if $i = j$

It is guaranteed that the sum of values of $N$ over all the test cases doesn't exceed $2*10^6$.

### Subtasks
- 30 points : $1 \leq N \leq 500$
- 70 points : original constraints
### Sample 1:
Input
Output

```
2
4
1 2 4 3
4
1 3 4 2
```

```
YES
NO
```

### Explanation:

 **Test-case 1:**  Consider the following sequence of operations

- Remove $1$ from $A$ and push it into $S$.
- Remove $1$ from $S$ and append it to $B$.
- Remove $2$ from $A$ and push it into $S$.
- Remove $2$ from $S$ and append it to $B$.
- Remove $4$ from $A$ and push it into $S$.
- Remove $3$ from $A$ and push it to $S$.
- Remove $3$ from $S$ and append it to $B$.
- Remove $4$ from $S$ and append it to $B$.

By following above sequence of operations you end up with $B = [1, 2, 3, 4]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T15:48:06.922Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/STKSORT)