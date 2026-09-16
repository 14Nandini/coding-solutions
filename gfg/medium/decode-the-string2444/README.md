# Decode the String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an encoded string s, decode it by expanding the pattern k[substring], where the substring inside brackets is written  **k**  times. k is guaranteed to be a positive integer, and encodedString contains only lowercase english alphabets. Return the final decoded string.

 **Note:** The test cases are generated so that the length of the output string will never exceed 105 .

 **Examples:** 

```
Input: s = "3[b2[ca]]"
Output: "bcacabcacabcaca"
Explanation:
Inner substring “2[ca]” breakdown into “caca”.
Now, new string becomes “3[bcaca]”
Similarly “3[bcaca]” becomes “bcacabcacabcaca” which is final result.

```

```
Input: s = "3[ab]"
Output: "ababab"
Explanation: The substring "ab" is repeated 3 times giving "ababab".
```

 **Constraints:** 
1 ≤ |s| ≤ 105 
1 ≤ k ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T04:56:49.029Z  

```java
class Solution {
    static String decodedString(String s) {
        // code here
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int k = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                num.push(k);
                str.push("[");
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder sb = new StringBuilder();
                while(!str.isEmpty() && str.peek() != "["){
                    sb.insert(0,str.pop());
                }
                if(!str.isEmpty()) str.pop();
                String temp = sb.toString().repeat(num.pop());
                str.push(temp);
            }
            else str.push(String.valueOf(ch));
        }
        StringBuilder res = new StringBuilder();
        while(!str.isEmpty()){
            res.insert(0, str.pop());
        }
        return res.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/decode-the-string2444/1)