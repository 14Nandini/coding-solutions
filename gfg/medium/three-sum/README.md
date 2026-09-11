# Three Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr**, return all the  **unique** triplets [arr[i], arr[j], arr[k]] such that **i != j, i != k, and j != k,** and  **arr[i] + arr[j] + arr[k] == 0.** 

Note: The triplets must be returned in  **sorted** order, the solution vector should also be  **sorted**, and the answer must not contain any  **duplicate** triplets.

 **Examples:** 

```
Input: arr = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: arr[0] + arr[1] + arr[2] = (-1) + 0 + 1 = 0.
arr[1] + arr[2] + arr[4] = 0 + 1 + (-1) = 0.
arr[0] + arr[3] + arr[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].

```

```
Input: arr = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
```

**Constraints:
**3 <= arr.length <= 3000
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T04:55:36.642Z  

```java
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        int target = 0, n = arr.length;
        Arrays.sort(arr);
        Set<ArrayList<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int j = i + 1, k = n - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    set.add(new ArrayList(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    k--;
                }
                else if(sum < target) j++;
                else k--;
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.addAll(set);
        Collections.sort(res, Comparator.comparing((ArrayList<Integer> list) -> list.get(0))
        .thenComparing(list -> list.get(1)).
        thenComparing(list -> list.get(2)));
        return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-sum/1)