# EVNMX

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even-Max

Given an array $A$ of $N$ integers and an integer $k$, Help us find the first even number in every subarray of $A$ of length $k$.

### Input Format

First Line would have the number $N$, $k$ signifying the amount of numbers and length of the subarray separated by a space. The second Line contains $N$ numbers separated by a space.

### Output Format

Output the cost of the bunch, if there is no even number output $-1$

### Constraints
- $1 \leq k \leq N \leq 10^5$
- $1 \leq number[i] \leq 10^9$
### Sample 1:
Input
Output

```
4 2
12 32 43 23

```

```
12 32 -1
```

### Explanation:

In the first window of 2 numbers [12,32], the first even number is 12, similarly in the second window,[32,43], 32 is the first even number, and in the third window, [43,23], there is no even number

### Sample 2:
Input
Output

```
3 2
1 5 2

```

```
-1 2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T17:07:21.037Z  

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
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(!dq.isEmpty() && dq.peekFirst() < i-k+1) dq.pollFirst();
            if(a[i] % 2 == 0) dq.addLast(i);
            if(i >= k - 1){
                if(!dq.isEmpty())
                    sb.append(a[dq.peekFirst()]).append(" ");
                else sb.append("-1 ");
            }
        }
        System.out.println(sb.toString().trim());
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EVNMX)