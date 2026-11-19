# Infix to Postfix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**  representing an  **infix expression**. Convert this infix expression to a postfix expression.

- Infix expression: The expression of the form a op b. When an operator is in between every pair of operands.
- Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.

 **Note:**  The precedence order is as follows: (^) has the highest precedence and is evaluated from right to left, (* and /) come next with left to right associativity, and (+ and -) have the lowest precedence with left to right associativity.

 **Examples :** 

```
Input: s = "a*(b+c)/d"
Output: abc+*d/
Explanation: The expression is a *(b+c)/d. First, inside the brackets, b+c becomes bc+. Now the expression looks like a* (bc+)/d. Next, multiply a with (bc+), so it becomes abc+ *. Finally, divide this result by d, so it becomes abc+* d/.

```

```
Input: s = "a+b*c+d"
Output: abc*+d+
Explanation: The expression a+b *c+d is converted by first doing b* c -> bc *, then adding a -> abc* +, and finally adding d -> abc*+d+.

```

```
Input: s = "(a+b)*(c+d)"
Output: ab+cd+*
Explanation: The expression (a+b) *(c+d) is converted by first doing (a+b) -> ab+, then doing (c+d) -> cd+, and finally the expression ab+* cd+ becomes ab+cd+*. 
```

 **Constraints:** 
1 ≤ s.length ≤ 5*103
s[i] can be an operand (a–z, A–Z, 0–9), an operator (+, -, *, /, ^) or a parenthesis ((,))

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T16:24:54.001Z  

```java
class Solution {
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) sb.append(ch);
            else if(ch == '(') st.push(ch);
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                if(!st.isEmpty()) st.pop();
            }
            else{
                while(!st.isEmpty() && (
                    (ch == '^' && getPrecedence(ch) < getPrecedence(st.peek())) ||
                    (ch != '^' && getPrecedence(ch) <= getPrecedence(st.peek()))
                )){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    static int getPrecedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '^') return 3;
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1)