# Jewels and Stones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

 

 **Example 1:** 

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

```

 **Example 2:** 

```
Input: jewels = "z", stones = "ZZ"
Output: 0

```

 

 **Constraints:** 

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 9.93%)  
**Memory:** 42.9 MB (beats 77.39%)  
**Submitted:** 2026-10-23T05:43:32.312Z  

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : jewels.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int res = 0;
        for(char ch : stones.toCharArray()){
            if(hm.containsKey(ch)) res += hm.get(ch);
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/)