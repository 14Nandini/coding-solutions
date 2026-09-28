# print-linked-list-elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T06:14:41.835Z  

```java
/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        Node temp = head;
        while(temp != null){
            res.add(temp.data);
            temp = temp.next;
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1)