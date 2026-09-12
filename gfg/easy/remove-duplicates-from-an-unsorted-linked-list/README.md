# Remove Duplicates from Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a head of an unsorted linked list. Remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all other duplicates are to be removed.

 **Examples:** 

```
Input: head = 5 -> 2 -> 2 -> 4
Output: 5 -> 2 -> 4
Explanation: Given linked list elements are 5 -> 2 -> 2 -> 4, in which 2 is repeated only. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain 5->2->4
 
```

```
Input: head = 2 -> 2 -> 2 -> 2 -> 2
Output: 2
Explanation: Given linked list elements are 2 -> 2 -> 2 -> 2 -> 2, in which 2 is repeated. So, we will delete the extra repeated elements 2 from the linked list and the resultant linked list will contain only 2.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T05:29:59.496Z  

```java
/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        if(head == null) return null;
        HashSet<Integer> hs = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while(curr != null){
            if(hs.contains(curr.data)) prev.next = curr.next;
            else{
                hs.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1)