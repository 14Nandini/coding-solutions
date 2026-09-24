# SNAPCHAT - Rating 965

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Snapchat

The most popular feature on snapchat is  *Snapchat Streak*.
A  *streak*  is maintained between two people if  **both**  of them send  **at least one**  snap to each other  **daily**.
If, on any day, either person forgets to send at least one snap, the streak breaks and the streak count is set to $0$.

Chef and Chefina like maintaining their snapchat streak. You observed the snap count of both of them for $N$ consecutive days.
On the $i^{th}$ day, Chef sent $A_i$ snaps to Chefina while Chefina sent $B_i$ snaps to Chef.

Find the  **maximum**  streak count they achieved in those $N$ days.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains an integer $N$ — the number of days you observed. The second lines contains $N$ space-separated integers — $A_1, A_2, \ldots, A_N$, the number of snaps Chef sent to Chefina on the $i^{th}$ day. The third lines contains $N$ space-separated integers — $B_1, B_2, \ldots, B_N$, the number of snaps Chefina sent to Chef on the $i^{th}$ day.
### Output Format

For each test case, output on a new line, the  **maximum**  streak count they achieved in those $N$ days.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 1000$
- $0 \leq A_i, B_i \leq 100$
### Sample 1:
Input
Output

```
4
3
3 1 2
2 4 1
2
0 0
10 10
4
5 4 0 2
3 1 1 0
5
0 1 1 2 0
1 1 0 0 3

```

```
3
0
2
1

```

### Explanation:

 **Test case $1$:**  For all $3$ days, both Chef and Chefina sent at least one snap per day. Thus, at the end of third day, the streak count is $3$.

 **Test case $2$:**  Chef did not send any snap to Chefina. Thus, at the streak count remains $0$ on both days.

 **Test case $3$:**  For the first two days, both Chef and Chefina send at least one snap per day. Thus, at the end of second day, the streak count is $2$.
On the end of third day, since Chef did not send any snap, the streak count becomes $0$.
On the end of fourth day, since Chefina did not send any snap, the streak count remains $0$.

 **Test case $4$:** 

- On the end of first day, since Chef did not send any snap, the streak count remains $0$.
- On second day, both Chef and Chefina sent at least one snap. Thus, the streak count becomes $1$.
- On the end of third day, since Chefina did not send any snap, the streak count becomes $0$.
- On the end of fourth day, since Chefina did not send any snap, the streak count remains $0$.
- On the end of fifth day, since Chef did not send any snap, the streak count remains $0$.

The maximum streak count over $5$ days is $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:41:27.215Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int currStreak = 0, maxStreak = 0;
            for(int i = 0; i < n; i++){
                if(a[i] > 0 && b[i] > 0){
                    currStreak++;
                    maxStreak = Math.max(currStreak, maxStreak);
                }
                else currStreak = 0;
            }
            System.out.println(maxStreak);
            }
        // Your code goes here
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SNAPCHAT)