# MFRLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Most Frequent Letter

You are given a string $S$ containing uppercase and lowercase English letters, digits, spaces, and special characters.

Only the  **alphabetic characters**  in the string are considered. Letter case is ignored, so uppercase and lowercase forms of the same letter are treated as equal. For example, `A` and `a` represent the same letter.

Find the letter that appears most frequently in $S$.

If multiple letters have the same maximum frequency, choose the one that comes  **first alphabetically**.

Print the answer as a lowercase letter.

### Input Format
- The first line contains the string $S$.
### Output Format
- Print a single lowercase letter — the most frequent alphabetic character in $S$.
### Constraints
- $1 \le |S| \le 10^5$
- $S$ may contain uppercase and lowercase English letters, digits, spaces, and special characters.
- $S$ contains at least one English alphabetic character.
### Sample 1:
Input
Output

```
Hello, World! 123
```

```
l
```

### Explanation:

Ignoring non-alphabetic characters and letter case, the string becomes `helloworld`.

The letter `l` appears $3$ times, which is more than any other letter.

Therefore, the answer is `l`.

### Sample 2:
Input
Output

```
zzYYxx
```

```
x
```

### Explanation:

After ignoring case, the letters `x`, `y`, and `z` each appear $2$ times.

Since `x` comes first alphabetically, the answer is `x`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T15:12:58.609Z  

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
        String input = sc.nextLine();
        String str = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        char maxChar = ' ';
        int maxFreq = -1;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.print(maxChar);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MFRLE)