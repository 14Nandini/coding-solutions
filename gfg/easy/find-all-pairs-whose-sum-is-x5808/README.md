# All Pairs with Sum from 2 Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two unsorted arrays  **a[]**   and b **[]**, the task is to find all pairs whose sum equals  **x**  from both arrays.

Note: All pairs should be returned in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be returned first else second.

 **Examples:** 

```
Input: target = 9, a[] = [1, 2, 4, 5, 7], b[] = [5, 6, 3, 4, 8]
Output: 
1 8
4 5 
5 4
Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.

```

```
Input: target = 8, a[] = [-1, -2, 4, -6, 5, 7], b[] = [6, 3, 4, 0]
Output:
4 4 
5 3

```

```
Input: target = 9, a[] = [1, 2, 4, 5, 7, 4], b[] = [5, 6, 3, 4, 8, 4]
Output:
1 8
4 5
4 5
5 4
5 4
Explanation: (1, 8), (4, 5), (4, 5), (5, 4) and (5, 4) are the pairs which sum to 9.
```

 **Constraints:** 
1 ≤ arr1.size, arr2.size ≤ 105
-2 *104 ≤ target, arr1[i], arr2[i] ≤ 2* 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:11:25.355Z  

```java
/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(arr1);
        for(int i = 0; i < arr2.length; i++){
            hm.put(arr2[i], hm.getOrDefault(arr2[i], 0) + 1);
        }
        ArrayList<pair> pairList = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            int u = arr1[i]; 
            int reqd = target - u;
            if(hm.containsKey(reqd)){
                int c = hm.get(reqd);
                for (int j = 0; j < c; j++) {
                    pairList.add(new pair((long) u, (long) reqd)); 
                }
            }
        }
        pair[] result = new pair[pairList.size()];
        return pairList.toArray(result);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1)