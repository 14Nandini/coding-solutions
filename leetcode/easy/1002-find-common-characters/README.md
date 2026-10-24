# Find Common Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string array `words`, return  *an array of all characters that show up in all strings within the* `words` *(including duplicates)*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

```

 **Example 2:** 

```
Input: words = ["cool","lock","cook"]
Output: ["c","o"]

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 100
- words[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 25.26%)  
**Memory:** 45.9 MB (beats 21.21%)  
**Submitted:** 2026-10-24T15:52:51.110Z  

```java
class Solution {
    public List<String> commonChars(String[] words) {
        // Create a list to store the common characters
        List<String> result = new ArrayList<>();
        
        // Iterate through each character from 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // Initialize the minimum count for the current character to the maximum possible integer value
            int minCount = Integer.MAX_VALUE;
            
            // Iterate through each word
            for (String word : words) {
                int count = 0;
                // Count the occurrences of the current character in the current word
                for (char ch : word.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                // Update the minimum count for the current character
                minCount = Math.min(minCount, count);
                // If the minimum count becomes 0, no need to check further
                if (minCount == 0) {
                    break;
                }
            }
            
            // Add the current character to the result list the required number of times
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(c));
            }
        }
        
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-common-characters/)