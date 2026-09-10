# Kth from End of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head**  of a linked list and an integer  **k**, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1.

 **Examples :** 

```
Input: k = 2

Output: 8
Explanation: 

The 2nd node from end is 8.
```

```
Input: k = 3

Output: 40

The 3rd node from the end is 40.
```

```
Input: k = 5

Output: -1
Explanation: The given linked list is 10 -> 5 -> 100 -> 5. Since 'k' is more than the number of nodes, the output is -1.

```

 **Constraints:** 
1 ≤ number of nodes ≤ 106
1 ≤ node->data, x ≤ 106
1 ≤ k ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T04:59:40.304Z  

```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node temp = head;
        int n = 1, m = 0;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        if(k > n) return -1;
        Node res = head;
        while(m < n - k){
            res = res.next;
            m++;
        }
        return res.data;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1)