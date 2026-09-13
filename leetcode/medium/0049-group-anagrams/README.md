# Group Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `strs`, group the anagrams together. You can return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  strs = ["eat","tea","tan","ate","nat","bat"]

 **Output:**  [["bat"],["nat","tan"],["ate","eat","tea"]]

 **Explanation:** 

- There is no string in strs that can be rearranged to form "bat".
- The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
- The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

 **Example 2:** 

 **Input:**  strs = [""]

 **Output:**  [[""]]

 **Example 3:** 

 **Input:**  strs = ["a"]

 **Output:**  [["a"]]

 

 **Constraints:** 

- 1 <= strs.length <= 104
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 22.54%)  
**Memory:** 49.9 MB (beats 33.67%)  
**Submitted:** 2026-09-13T12:55:13.826Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str : strs){
            String freqStr = getFreqStr(str);
            if(hm.containsKey(freqStr)){
                hm.get(freqStr).add(str);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                hm.put(freqStr, temp);
            }
        }
        return new ArrayList<>(hm.values());
    }
    private String getFreqStr(String str){
        int[] freq = new int[26];
        StringBuilder res = new StringBuilder("");
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        char ch = 'a';
        for(int i : freq){
            res.append(ch);
            res.append(i);
            ch++;
        }
        return res.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/group-anagrams/)