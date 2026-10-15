# MAX_DIFF - Rating 1254

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### The Two Dishes

Chef prepared two dishes yesterday. Chef had assigned the $\textbf{tastiness}$ $T_1$ and $T_2$ to the first and to the second dish respectively. The tastiness of the dishes can be any $\textbf{integer}$ between $0$ and $N$ (both inclusive).

Unfortunately, Chef has forgotten the values of $T_1$ and $T_2$ that he had assigned to the dishes. However, he remembers the sum of the tastiness of both the dishes - denoted by $S$.

Chef wonders, what can be the maximum possible absolute difference between the tastiness of the two dishes. Can you help the Chef in finding the maximum absolute difference?

It is guaranteed that at least one pair $\{T_1, T_2\}$ exist such that $T_1 + T_2 = S, 0 \leq T_1, T_2 \leq N$.

### Input Format
- The first line of input contains a single integer $T$, denoting the number of testcases. The description of the $T$ testcases follows.
- The first and only line of each test case contains two space-separated integers $N$, $S$, denoting the maximum tastiness and the sum of tastiness of the two dishes, respectively.
### Output Format

For each testcase, output a single line containing the maximum absolute difference between the tastiness of the two dishes.

### Constraints
- $1 \leq T \leq 10^3$
- $1 \leq N \leq 10^5$
- $1 \leq S \leq 2 \cdot 10^5$
### Sample 1:
Input
Output

```
3
3 1
4 4
2 3
```

```
1
4
1
```

### Explanation:

 **Test Case $1$:**  The possible pairs of $\{T_1, T_2\}$ are $\{0, 1\}$ and $\{1, 0\}$. Difference in both the cases is $1$, hence the maximum possible absolute difference is $1$.

 **Test Case $2$:**  The possible pairs of $\{T_1, T_2\}$ are $\{0, 4\}$, $\{1, 3\}$, $\{2, 2\}$, $\{3, 1\}$ and $\{4, 0\}$. The maximum possible absolute difference is $4$.

 **Test Case $3$:**  The possible pairs of $\{T_1, T_2\}$ are $\{1, 2\}$ and $\{2, 1\}$. Difference in both the cases is $1$, and hence the maximum possible absolute difference is $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T16:24:54.256Z  

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
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int s = sc.nextInt();
                
                if (s <= n) {
                    System.out.println(s);
                } 
                else {
                    System.out.println(2 * n - s);
                }
            }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAX_DIFF)