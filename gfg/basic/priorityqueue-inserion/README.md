# PriorityQueue Insertion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer ArrayList  **arr[]**, you need to insert the given elements into a PriorityQueue.
 **Note:** PriorityQueue in Java is implemented as a min heap.

 **Examples:** 

```
Input: arr[] = [5, 4, 2, 99, 5, 3]
Output: 2 3 4 5 5 99
Explanation: After inserting given elements in a PQ, they get arranged in a min heap way. So when we print it we get in sorted order.
```

```
Input: arr[] = [5, 5]
Output: 5 5
Explanation: After inserting given elements in a PQ, they get arranged in a min heap way. So when we print it we get in sorted order.
```

 **Constraints:** 
1 <= arr.size() <= 103
1 <= arri <= 107

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:21:25.905Z  

```java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.add(num);
        }
        return pq;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/priorityqueue-inserion/1)