# MONSTER1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Defeat The Monster 1

A monster has $H$ health points. Each time you hit it with a sword it loses $X$ health points. However, the monster always gains $Y$ health points right before every one of your hits.

The monster is considered defeated when the number of health points it has becomes zero or less than zero. You need to find if it is possible to defeat the monster.

### Input Format
- The first line of the input contains a single integer $T$ - the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains three space-separated integers $H$, $X$ and $Y$.
### Output Format
- For each test case, print a single line containing one integer. That integer should be $1$ if it is possible to defeat the monster and $0$ otherwise.
### Constraints
- $1 \leq T \leq 100$
- $1 \leq H,X,Y \leq 10^{18}$
### Sample 1:
Input
Output

```
4
3 6 2
4 6 3
7 1 2
1 1 2
```

```
1
1
0
0
```

### Explanation:

 **Example case 1:**  The monster will have $3+2=5$ health points before the first hit. Therefore, it will be defeated after the first hit.

 **Example case 2:**  The monster will have $4+3=7$ health points before the first hit. After the first hit, the monster will have $7-6=1$ health point. Before the second hit, the monster will have $1+3=4$ health points. Therefore, it will be defeated after the second hit.

 **Example case 3:**  It is impossible to defeat the monster.

 **Example case 4:**  It is impossible to defeat the monster.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T05:53:48.322Z  

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
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x > y) System.out.println(1);
            else System.out.println(0);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONSTER1)