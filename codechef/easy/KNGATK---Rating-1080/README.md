# KNGATK - Rating 1080

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Attack on Kingdom

Nightking wants to attack the kingdom and he really likes cold days. However, he doesn’t want to attack the kingdom on the coldest day, because it is obvious.

Instead, he will attack the second coldest day. Given an array $A$ of $N$  **distinct**  integers where $A_i$ represents the temperature forecast of the $i$-th day, You need to find the temperature of the day of the attack.

### Input Format
- First-line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case contains two lines of input.
- The first line of every test case contains an integer $N$ - the number of days
- The second line of every test case contains $N$ integers - $A_1,A_2,..,A_N$ denoting the temperature forecast of the $i$-th day.
### Output Format

For each test case, output in a single line - the answer to the $i$-th test case.

### Constraints
- $1 \leq T \leq 1500$
- $2 \leq N \leq 2 \cdot 10^5$
- $1 \leq A_i \leq 10^9$
### Subtasks
- 30 points : $1 \leq N \leq 2000, \sum N \leq 5000$
- 70 points : $1 \leq N \leq 2\cdot 10^5, \sum N \leq 5\cdot10^5$
### Sample 1:
Input
Output

```
3
2
1 2
3
7 4 9
5
45 76 91 21 9
```

```
2
7
21
```

### Explanation:
- Test Case $1$: There are only $2$ days, so the night king will attack the day with a higher temperature.
- Test Case $3$: Out of the $5$ possible days, Night King will attack the day with the 2nd lowest temperature, therefore $21$ will be the answer.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:50:22.891Z  

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



```

---

[View on CodeChef](https://www.codechef.com/problems/KNGATK)