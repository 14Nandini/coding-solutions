# Juggler Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Juggler Sequence is a series of integers in which the first term starts with a positive integer number  *a*  and the remaining terms are generated from the immediate previous term using the below recurrence relation:

Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.

 **Examples:** 

```
Input: n = 9
Output: 9 27 140 11 36 6 2 1
Explaination: We start with 9 and use 
above formula to get next terms.
```

```
Input: n = 6
Output: 6 2 1
Explaination: 
[61/2] = 2. 
[21/2] = 1.
```

 **Constraints:** 
1 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T16:19:37.287Z  

```java
class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> l = new ArrayList<>();
        l.add(n);
        while(n>1){
            if(n%2==0){
                n =(long) Math.floor(Math.sqrt(n));
                l.add(n);
            }
            else{
                n =(long)Math.floor(Math.pow(n,1.5));
                l.add(n);
            }
        }
        return l;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/juggler-sequence3930/1)