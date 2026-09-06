# PriorityQueue Insertion - 2

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer ArrayList  **arr[]**, you need to insert the given elements into a PriorityQueue such that they exist in a max-heap order.
 **Note:** PriorityQueue in Java is implemented as a min heap but here you need to customize it to a max-heap.

 **Examples:** 

```
Input: arr[] = [5, 4, 2, 99, 5, 3]
Output: 99 5 5 4 3 2
Explanation: We customize our PQ as a max-heap and insert the elements.

```

```
Input: arr[] = [5, 5]
Output: 5 5
Explanation: We customize our PQ as a max-heap and insert the elements.
```

 **Constraints:** 
1 <= arr.size() <= 103
1 <= arri <= 107

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:24:15.321Z  

```java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num : arr) pq.add(num);
        return pq;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/priorityqueue-inserion-2/1)