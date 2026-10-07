# PSWDCHEF

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Password Chef

You have been given a string $S$. You have been asked to make a strong password out of it. But you being a lazy programmer want to do it in the minimum number of steps. A string is called to be a strong password if :

- It is at least 8 characters long.
- It has at least a lower case character.
- It has at least a upper case character.
- It has at least a special character. (Any character which is not lower case or upper case is special character).

You can just add characters to the string in the end. What is the minimum number of characters you need to add to make it a strong password?

### Input Format
- First line will contain $T$, the number of test cases.
- For every test case,next line will contains 1 integer $N$, size of the string and its next line has the string $S$.
### Output Format

For each testcase, minimum number of characters you can add to make the string $S$ a strong password.

### Constraints
- $1 \leq T \leq 10$
- $2 \leq |S| \leq 10^6$
### Sample 1:
Input
Output

```
1
2
ab

```

```
6
```

### Explanation:

As the string has to be 8 letters long, it needs 6 more characters which can accommodate the other 2 properties as well

### Sample 2:
Input
Output

```
1
8
ABcDefGh

```

```
1
```

### Explanation:

It need just a special character to satisfy the properties.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T15:15:40.394Z  

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
            boolean hasLower = false, hasUpper = false, hasSpcl = false;
            for(char ch : s.toCharArray()){
                if(Character.isLowerCase(ch)) hasLower = true;
                else if(Character.isUpperCase(ch)) hasUpper = true;
                else hasSpcl = true;
            }
            int c = 0;
            if(!hasLower) c++;
            if(!hasUpper) c++;
            if(!hasSpcl) c++;
            int len = Math.max(0, 8 - s.length());
            System.out.println(Math.max(len, c));
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PSWDCHEF)