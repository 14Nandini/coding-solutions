# TWODISH - Rating 1140

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Two Dishes

Chef will have $N$ guests in his house today. He wants to serve at least one dish to each of the $N$ guests. Chef can make two types of dishes. He needs one fruit and one vegetable to make the first type of dish and one vegetable and one fish to make the second type of dish. Now Chef has $A$ fruits, $B$ vegetables, and $C$ fishes in his house. Can he prepare at least $N$ dishes in total?

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of a single line of input, four integers $N, A, B, C$.
### Output Format

For each test case, print "YES" if Chef can prepare at least $N$ dishes, otherwise print "NO". Print the output without quotes.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N, A, B, C \leq 100$
### Subtasks
- Subtask 1 (100 points): Original constraints
### Sample 1:
Input
Output

```
4
2 1 2 1
3 2 2 2
4 2 6 3
3 1 3 1

```

```
YES
NO
YES
NO
```

### Explanation:

 **Test case $1$** : Chef prepares one dish of the first type using one fruit and one vegetable and another dish of the second type using one vegetable and one fish.

 **Test case $2$** : Chef prepares two dishes of the first type using two fruit and two vegetable. Now all the vegetables are exhausted, hence he can't prepare any other dishes.

 **Test case $3$** : Chef can prepare a total of $5$ dishes, two dishes of the first type and three dishes of the second type.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T08:00:19.271Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
            
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
                
            int maxDishes = Math.min(b, a + c);
                
            if (maxDishes >= n) 
                System.out.println("YES");
            else
                System.out.println("NO");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWODISH)