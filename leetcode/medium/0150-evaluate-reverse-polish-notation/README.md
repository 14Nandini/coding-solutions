# Evaluate Reverse Polish Notation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of strings `tokens` that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return  *an integer that represents the value of the expression*.

 **Note**  that:

- The valid operators are '+', '-', '*', and '/'.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- There will not be any division by zero.
- The input represents a valid arithmetic expression in a reverse polish notation.
- The answer and all the intermediate calculations can be represented in a 32-bit integer.

 

Original
Java
 **Example 1:** 

```
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

```

 **Example 2:** 

```
Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

```

 **Example 3:** 

```
Input: tokens = ["10","6","9","3","+","-11"," *","/","* ","17","+","5","+"]
Output: 22
Explanation: ((10  *(6 / ((9 + 3)*  -11))) + 17) + 5
= ((10  *(6 / (12*  -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

```

 

 **Constraints:** 

- 1 <= tokens.length <= 104
- tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 90.38%)  
**Memory:** 44.9 MB (beats 73.28%)  
**Submitted:** 2026-11-20T05:47:08.705Z  

```java
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String ch = tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) { 
                int ch1 = st.pop();
                int ch2 = st.pop();
                if(ch.equals("+")) st.push(ch1 + ch2); 
                else if(ch.equals("-")) st.push(ch2 - ch1);
                else if(ch.equals("*")) st.push(ch1 * ch2);
                else if (ch.equals("/")) {
                    st.push(ch2 / ch1);
                }
            }
            else st.push(Integer.parseInt(ch));
        } 
        return st.peek();
    }
} 
```

---

[View on LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/)