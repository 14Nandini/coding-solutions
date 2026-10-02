# pair-with-given-sum-in-a-sorted-array4940

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T08:44:51.109Z  

```java
class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int c = 0;
        for(int num : arr){
            int temp = target - num;
            if(hm.containsKey(temp)){
                c += hm.get(temp);
            }
            hm.put(num, hm.getOrDefault(num , 0) + 1);
        }
        return c;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1)