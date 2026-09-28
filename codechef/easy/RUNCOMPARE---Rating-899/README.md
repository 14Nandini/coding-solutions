# RUNCOMPARE - Rating 899

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Running Comparison

Alice and Bob recently got into running, and decided to compare how much they ran on different days.

They each ran for $N$ days — on the $i^{th}$ day, Alice ran $A_i$ meters and Bob ran $B_i$ meters.

On each day,

- Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
- Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.

For example, on a given day

- If Alice ran $200$ meters and Bob ran $500$, Alice would be unhappy but Bob would be happy.
- If Alice ran $500$ meters and Bob ran $240$, Alice would be happy and Bob would be unhappy.
- If Alice ran $300$ meters and Bob ran $500$, both Alice and Bob would be happy.

On how many of the $N$ days were  **both**  Alice and Bob happy?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of three lines of input. The first line of each test case contains a single integer $N$ — the number of days. The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — the distances run by Alice on the $N$ days. The third line of each test case contains $N$ space-separated integers $B_1, B_2, \ldots, B_N$ — the distances run by Bob on the $N$ days.
### Output Format

For each test case, output on a new line the number of days when  **both**  Alice and Bob were happy.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 100$
- $1 \leq A_i, B_i \leq 10^5$
### Sample 1:
Input
Output

```
4
3
100 200 300
300 200 100
4
1000 1000 1000 1000
400 500 600 1200
4
800 399 1400 532
2053 2300 3400 23
5
800 850 900 950 1000
600 800 1000 1200 1400

```

```
1
3
0
5

```

### Explanation:

 **Test case $1$:**  Alice is unhappy on the first day, since she ran $100$ meters but Bob ran $300$; and $300$ is more than twice of $100$.
Similarly, Bob is unhappy on the third day.
Both Alice and Bob are happy on the second day, so the answer is $1$.

 **Test case $2$:**  Bob is unhappy on day $1$ and happy on every other day, while Alice is happy on every day. So, they're both happy on three days — the second, third, and fourth.

 **Test case $3$:**  Alice is unhappy on days $1, 2, 3$ and Bob is unhappy on day $4$.

 **Test case $4$:**  Alice and Bob are both happy on all five days.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T06:39:11.864Z  

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
            // Your code goes here
            int count = 0;
            for(int i = 0; i < n; i++){
                if(a[i]*2 >= b[i] && b[i]*2 >= a[i]) count++;
            }
            System.out.println(count);
            
            /*
            
            Alice Unhappy - a*2 < b
                  Happy   - a*2 >= b
                
            Bob   Unhappy - b*2 < a
                  Happy   - b*2 >= a
            
            */
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RUNCOMPARE)