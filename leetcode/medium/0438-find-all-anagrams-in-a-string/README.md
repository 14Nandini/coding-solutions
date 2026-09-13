# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 44.13%)  
**Memory:** 46.6 MB (beats 82.28%)  
**Submitted:** 2026-09-13T02:42:06.147Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] scnt = new int[26];
        int[] pcnt = new int[26];
        List<Integer> res = new ArrayList<>();
        for(char ch : p.toCharArray()){
            pcnt[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            scnt[s.charAt(i) - 'a']++;
            if(i >= p.length()) scnt[s.charAt(i - p.length()) - 'a']--;
            if(Arrays.equals(pcnt, scnt)) 
                res.add(i - p.length() + 1);
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)