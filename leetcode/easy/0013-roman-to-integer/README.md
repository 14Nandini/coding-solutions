# Roman to Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

- I can be placed before V (5) and X (10) to make 4 and 9. 
- X can be placed before L (50) and C (100) to make 40 and 90. 
- C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

 

 **Example 1:** 

```
Input: s = "III"
Output: 3
Explanation: III = 3.

```

 **Example 2:** 

```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

```

 **Example 3:** 

```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

```

 

 **Constraints:** 

- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that s is a valid roman numeral in the range [1, 3999].

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 30.86%)  
**Memory:** 46.7 MB (beats 27.24%)  
**Submitted:** 2026-09-16T16:07:00.536Z  

```java
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        for(int i = 0; i < s.length() - 1; i++){
            int curr = hm.get(s.charAt(i));
            int next = hm.get(s.charAt(i+1));
            if(curr >= next) sum += curr;
            else sum -= curr;
        }
        sum = sum + hm.get(s.charAt(s.length()-1));
        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/roman-to-integer/)