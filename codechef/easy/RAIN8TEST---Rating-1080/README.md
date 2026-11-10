# RAIN8TEST - Rating 1080

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Taxi Cost

If you travel to work by taxi, it costs you $X$ dollars. If you travel by foot it is, of course, free of charge. You want to minimize the cost of travel, but you don’t want to walk when it’s raining or it has rained the day before. Given the weather forecast for the next $N$ days ($1$ if the rain is falling, $0$ otherwise), calculate the cost of travel.

### Input Format
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains $2$ integers $N$ - number of days and $X$ - cost for taxi
- The second line contains $N$ space-separated integers $D_1, D_2 … D_n$
### Output Format

For each test case, output a single line containing one integer - Total cost of the travel.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq X \leq 10^9$

Sum of $N$ over all test cases $\leq 10^5$

### Sample 1:
Input
Output

```
2
1 53
0
2 47
1
0
```

```
0
94
```

### Explanation:
- Test Case 1 : Day 1 : No rain. So, we can walk. Thus total cost is 0.
- Test Case 2 : Day 1 : Rain. So, we need to travel to work by taxi. Total cost on day 1 = 47. Day 2 : No rain. But since it rained the previous day, we need to travel to work by taxi. Total cost on day 2 = 94

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T14:02:17.895Z  

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
            long cost = sc.nextLong();
            long res = 0;
            int rPrev = 0;
            for(int i = 0; i < n; i++){
                int r = sc.nextInt();
                if(r == 1 || rPrev == 1){
                    res += cost;
                }
                rPrev = r;
            }
            System.out.println(res);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RAIN8TEST)