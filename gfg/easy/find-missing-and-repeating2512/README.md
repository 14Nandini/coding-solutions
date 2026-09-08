# Missing And Repeating

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr[]** of size  **n**, containing elements from the range  **1** to **n**, it is known that one number in this range is  **missing**, and another number  **occurs twice**  in the array, find both the  **duplicate** number and the  **missing** number.

**Examples:
**

```
Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and the missing number is 1.
```

```
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and the missing number is 2.
```

```
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
```

 **Constraints:** 
2 ≤ n ≤ 106
1 ≤ arr[i] ≤ n

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T14:24:18.491Z  

```java
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        // al = [-1, -1] 0th idx for duplicate  1st idx for missing
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1,-1));
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int i = 1; i <= arr.length; i++){
            if(!hm.containsKey(i)) al.set(1,i); // missing
            else if(hm.get(i) > 1) al.set(0,i); // occurs twice
        }
        return al;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1)