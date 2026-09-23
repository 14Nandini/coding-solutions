# EVNMX - Rating 800

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T17:47:01.762Z  

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
            int p = sc.nextInt();
            Deque<Integer> deque = new ArrayDeque<>();
            for(int i = 0; i < n; i++) deque.addLast(sc.nextInt());
            for(int i = 0; i < p; i++){
                deque.addLast(deque.pollFirst());
            }
            for(int num : deque) System.out.print(num + " ");
            System.out.println();
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EVNMX)