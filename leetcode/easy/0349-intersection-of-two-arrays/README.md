# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 47.33%)  
**Memory:** 44.8 MB (beats 69.78%)  
**Submitted:** 2026-09-08T06:34:43.837Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        for(int num : nums2) hs1.add(num);

        HashSet<Integer> hs2 = new HashSet<>();
        for(int num : nums1) hs2.add(num);

        for(int num : hs1){
            if(hs2.contains(num)) al.add(num);
        }
        int[] res = new int[al.size()];
        for(int i = 0; i < al.size(); i++) res[i] = al.get(i);
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)