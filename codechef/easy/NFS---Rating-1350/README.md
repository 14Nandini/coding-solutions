# NFS - Rating 1350

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Turn It

Chef is playing Need For Speed. Currently, his car is running on a straight road with a velocity $U$ metres per second and approaching a $90^{\circ}$ turn which is $S$ metres away from him. To successfully cross the turn, velocity of the car when entering the turn must not exceed $V$ metres per second.

The brakes of Chef's car allow him to slow down with a deceleration (negative acceleration) not exceeding $A$ metres per squared second. Tell him whether he can cross the turn successfully. The velocity $v$ when entering the turn can be determined from Newton's 2nd law to be $v^2 = U^2 + 2 \cdot a \cdot S$ if the car is moving with a uniform acceleration $a$.

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains four space-separated integers $U$, $V$, $A$ and $S$.
### Output

For each test case, print a single line containing the string `"Yes"` if Chef can cross the turn successfully or `"No"` if he cannot (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq U, V, A, S \leq 10^4$
### Subtasks

 **Subtask #1 (100 points):**  original constraints

### Sample 1:
Input
Output

```
3
1 1 1 1
2 1 1 1
2 2 1 1
```

```
Yes
No
Yes
```

### Explanation:

 **Example case 1:**  Since $U = V = 1$, Chef does not need to brake and will be able to turn successfully.

 **Example case 2:**  The smallest velocity Chef's car can have even with the maximum deceleration is $\sqrt{2 \cdot 2 - 2 \cdot 1 \cdot 1} = \sqrt{2}$, which is greater than the maximum allowed velocity for a safe turn.

 **Example case 3:**  The smallest velocity Chef's car can have with the maximum deceleration is again $\sqrt{2}$, which is smaller than the maximum allowed velocity for a safe turn.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T04:52:51.295Z  

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
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            
            int min = (u * u) - (2 * a * s);
            int max = v * v;
            
            if (min <= max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NFS)