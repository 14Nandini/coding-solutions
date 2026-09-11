# Permutations

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array `nums` of distinct integers, return all the possible permutations. You can return the answer in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

```

 **Example 2:** 

```
Input: nums = [0,1]
Output: [[0,1],[1,0]]

```

 **Example 3:** 

```
Input: nums = [1]
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 6
- -10 <= nums[i] <= 10
- All the integers of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 35.14%)  
**Memory:** 45.7 MB (beats 28.98%)  
**Submitted:** 2026-09-11T06:11:40.016Z  

```java
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(resList, new ArrayList<>(), nums);
        return resList;
    }

    public static List<List<Integer>> backtrack(List<List<Integer>> resList, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){
            resList.add(new ArrayList<>(tempList));
            return resList;
        }
        for(int num : nums){
            if(tempList.contains(num)) continue;
            tempList.add(num);
            backtrack(resList, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
        return resList;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutations/)