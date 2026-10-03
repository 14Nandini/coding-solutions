# count-subarray-with-k-odds

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T10:52:07.849Z  

```java
class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int currCnt = 0, subCnt = 0;
        for(int num : arr){
            currCnt += num % 2;
            if(hm.containsKey(currCnt - k)){
                subCnt += hm.get(currCnt - k);
            }
            hm.put(currCnt, hm.getOrDefault(currCnt, 0) + 1);
        }
        return subCnt;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-subarray-with-k-odds/1)