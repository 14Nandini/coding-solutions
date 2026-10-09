# implement-stack-using-linked-list

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T14:10:49.897Z  

```java
class myStack {
    Node top;
    int count;

    public myStack() {
        top = null;
        count = 0;
    }

    public boolean isEmpty() {
        if(top == null){
            return true;
        }
        return false;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        count++;
    }

    public void pop() {
        if(isEmpty()){
            return;
        }
        top = top.next;
        count--;
    }

    public int peek() {
        if(isEmpty()){
            return - 1;
        }
        return top.data;
    }

    public int size() {
       return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1)