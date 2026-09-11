# Permutations II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a collection of numbers, `nums`, that might contain duplicates, return  *all possible unique permutations  **in any order**.* 

 

 **Example 1:** 

```
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

```

 **Example 2:** 

```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 8
- -10 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 1 ms  
**Memory:** 43 MB  
**Submitted:** 2026-09-11T06:42:48.260Z  

```java
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resList, new ArrayList<>(), nums,new boolean[nums.length]);
        return resList;
    }
    public static List<List<Integer>> backtrack(List<List<Integer>> resList, List<Integer> tempList, int[] nums, boolean[] used){

        if(tempList.size() == nums.length && !resList.contains(tempList)){
            resList.add(new ArrayList<>(tempList));
            return resList;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            used[i] = true;
            tempList.add(nums[i]);

            backtrack(resList, tempList, nums, used);

            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
        return resList;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutations-ii/)