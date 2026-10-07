# Partition Labels

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string `"ababcc"` can be partitioned into `["abab", "cc"]`, but partitions such as `["aba", "bcc"]` or `["ab", "ab", "cc"]` are invalid.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`.

Return  *a list of integers representing the size of these parts*.

 

 **Example 1:** 

```
Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.

```

 **Example 2:** 

```
Input: s = "eccbbbbdec"
Output: [10]

```

 

 **Constraints:** 

- 1 <= s.length <= 500
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 34.98%)  
**Memory:** 43.6 MB (beats 57.11%)  
**Submitted:** 2026-10-07T09:40:32.104Z  

```java
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer>  hm = new HashMap<>();
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)) hm.put(ch, i);
        }
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        for(int k = 0; k < s.length(); k++){
            char ch = s.charAt(k);
            int lastOcc = hm.get(ch);
            j = Math.max(j, lastOcc);
            if(j == k){
                res.add(j-i+1);
                i = j + 1;
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/partition-labels/)