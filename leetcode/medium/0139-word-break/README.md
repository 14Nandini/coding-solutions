# Word Break

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

 **Note**  that the same word in the dictionary may be reused multiple times in the segmentation.

 

 **Example 1:** 

```
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".

```

 **Example 2:** 

```
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.

```

 **Example 3:** 

```
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 300
- 1 <= wordDict.length <= 1000
- 1 <= wordDict[i].length <= 20
- s and wordDict[i] consist of only lowercase English letters.
- All the strings of wordDict are unique.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-15T13:03:23.695Z  

```java
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        int maxLen = 0;
        for(String str : hs){
            if(str.length() > maxLen) maxLen = str.length();
        }
        int n = s.length();
        boolean[] res = new boolean[n + 1];
        res[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = i - 1; j >= Math.max(0, i - maxLen); j--){
                if(res[j] && hs.contains(s.substring(j, i))){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[n];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/word-break/)