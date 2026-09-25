# BRFISE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### BFS Ordering

You are given an undirected connected graph with $N$ nodes and $M$ edges. You are also given a node $X$.

A sequence in which all the nodes of a graph appear exactly once is called a  **BFS ordering**  if and only the breadth first search algorithm starting from the node $X$ can output it as a result.

You need to print the lexicographically minimal  **BFS ordering**  of the given graph that starts from the node $X$.

### Input Format
- The first line of the input contains a single integer $T$ - the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains three space-separated integers $N$, $M$ and $X$.
- $M$ lines follow. The $i$-th of these lines contains two space-separated integers $u_i$ and $v_i$ denoting an edge of the graph.
### Output Format
- For each test case, print a single line.
- In that line, print $N$ space-separated integers ― the lexicographically minimal BFS ordering of the given graph.
### Constraints
- $1 \le T \le 100$
- $1 \le N \le 2 \cdot 10^5$
- $N-1 \leq M \leq min(2 \cdot 10^5, (N \cdot (N-1))/2)$
- $1 \le X \le N$
- $1 \le u_i,v_i \le N$ for each valid $i$
- $u_i \neq v_i$ for each valid $i$
- For each pair of nodes there is at most one edge that connects them directly
- The undirected graph described on the input is guaranteed to be connected
- The sum of $N$ over all test cases does not exceed $4 \cdot 10^5$
- The sum of $M$ over all test cases does not exceed $4 \cdot 10^5$
### Sample 1:
Input
Output

```
2
5 5 2
4 2
1 3
2 1
3 4
2 5
5 7 5
1 2
2 5
5 4
2 4
1 4
1 3
3 4
```

```
2 1 4 5 3
5 2 4 1 3
```

### Explanation:

 **Example case 1:**  The given sequence is a  **BFS ordering**  because the breadth first search algorithm can indeed start from the node $X=2$, visit its adjacent nodes $1$, $4$ and $5$, and finally visit the node $3$ which is the farthest away from $X=2$. Note that this is the only correct answer. For example, sequences $2,1,5,4,3$ and $2,5,1,4,3$ are  **BFS orderings**  as well, but they are not lexicographically minimal.

 **Example case 2:**  The given sequence is a  **BFS ordering**  because the breadth first search algorithm can indeed start from the node $X=5$, visit its adjacent nodes $2$ and $4$, and finally visit nodes $1$ and $3$. Moreover, it is lexicographically minimal.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T15:49:14.482Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BRFISE)