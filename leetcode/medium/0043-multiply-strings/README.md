# Multiply Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

 **Note:**  You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Original
Java
 **Example 1:** 

```
Input: num1 = "2", num2 = "3"
Output: "6"

```

 **Example 2:** 

```
Input: num1 = "123", num2 = "456"
Output: "56088"

```

 

 **Constraints:** 

- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only.
- Both num1 and num2 do not contain any leading zero, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 13.20%)  
**Memory:** 42.8 MB (beats 96.62%)  
**Submitted:** 2026-11-23T13:12:52.014Z  

```java
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m + n];     
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder ans = new StringBuilder();
        int k = 0;
        while (k < res.length && res[k] == 0)
            k++;
        while (k < res.length) {
            ans.append(res[k]);
            k++;
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/multiply-strings/)