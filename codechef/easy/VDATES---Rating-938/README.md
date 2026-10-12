# VDATES - Rating 938

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Vaccine Dates

Chef has taken his first dose of vaccine $D$ days ago. He may take the second dose no less than $L$ days and no more than $R$ days since his first dose.

Determine if Chef is too early, too late, or in the correct range for taking his second dose.

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of a single line of input, three integers $D, L, R$.
### Output Format

For each test case, print a single line containing one string - "Too Early" (without quotes) if it's too early to take the vaccine, "Too Late" (without quotes) if it's too late to take the vaccine, "Take second dose now" (without quotes) if it's the correct time to take the vaccine.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq D \leq 10^9$
- $1 \leq L \leq R \leq 10^9$
### Subtasks
- Subtask 1 (100 points): Original constraints
### Sample 1:
Input
Output

```
4
10 8 12 
14 2 10
4444 5555 6666 
8 8 12

```

```
Take second dose now
Too Late
Too Early
Take second dose now
```

### Explanation:

 **Test case $1$:**  The second dose needs to be taken within $8$ to $12$ days and since the Day $10$ lies in this range, we can take the second dose now.

 **Test case $2$:**  The second dose needs to be taken within $2$ to $10$ days since Day $14$ lies after this range, it is too late now.

 **Test case $3$:**  The second dose needs to be taken within $5555$ to $6666$ days and since the Day $4444$ lies prior to this range, it is too early now.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T16:18:42.185Z  

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
            int d = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            if(d < l) System.out.println("Too Early");
            else if (d > r) System.out.println("Too Late");
            else System.out.println("Take second dose now");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VDATES)