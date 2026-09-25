# DISCOUNTT - Rating 700

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Take discount or Not

There are $n$ items in a shop. You know that the price of the $i$-th item is $A_i$. Chef wants to buy all the $n$ items.

There is also a discount coupon that costs $x$ rupees and reduces the cost of every item by $y$ rupees. If the price of an item was initially $\leq y$, it becomes free, i.e, costs $0$.

Determine whether Chef should buy the discount coupon or not. Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is  **strictly less**  than the price he pays without buying the discount coupon.

### Function Declaration

 **Function Name**  :

$checkCoupon$ – This function determines whether a coupon can be applied based on given conditions and item prices, and returns the result as a string.

### Parameters

$n$: An integer representing the number of items.

$x$: An integer representing the minimum number of items required to apply the coupon.

$y$: An integer representing the minimum total price required to apply the coupon.

$prices$: A 1D array of integers where each element represents the price of an item.

### Return Value

Returns a string indicating whether the coupon is applicable or not based on the given constraints.

 **The input and output formats given below are only if you want to test using custom inputs.** 

### Constraint:
- $1 \leq T \leq 1000$
- $1 \leq N \leq 100$
- $1 \leq X, Y \leq 10^5$
- $1 \leq A_i \leq 10^5$
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. The description of the test cases follows.
- Each test case consists of two lines of input. The first line of the test case contains three space-separated integers — $n$, $x$, and $y$. The second line contains $n$ space-separated integers — $A_1, A_2, \ldots, A_N$.
### Output Format
- For each test case, output COUPON if Chef should buy the discount coupon, and NO COUPON otherwise.

Each letter of the output may be printed in either lowercase or uppercase. For example, the strings `coupon`, `CouPoN`, and `COUPON` will all be treated as equivalent.

### Sample 1:
Input
Output

```
5
4 30 10
15 8 22 6
4 40 10
15 8 22 6
4 34 10
15 8 22 6
2 10 100
60 80
3 30 5
50 60 50

```

```
COUPON
NO COUPON
NO COUPON
COUPON
NO COUPON

```

### Explanation:

 **Test case $1$:**  The original cost of the items is $15 + 8 + 22 + 6 = 51$. Buying the coupon costs $30$, and after buying it the cost of buying all the items is $5 + 0 + 12 + 0 = 17$. The total cost of buying everything with the coupon is $30 + 17 = 47$, which is strictly less than $51$. So, Chef will buy the coupon.

 **Test case $2$:**  The original cost of the items is $15 + 8 + 22 + 6 = 51$. Buying the coupon costs $40$, and after buying it the cost of buying all the items is $5 + 0 + 12 + 0 = 17$. The total cost of buying everything with the coupon is $40 + 17 = 57$, which is more than $51$. So, Chef will not buy the coupon.

 **Test case $3$:**  The original cost of the items is $51$. Buying the coupon costs $34$, and the cost of buying all the items after using it is $17$, making the total cost $34 + 17 = 51$. Since this is not strictly less than the original cost, Chef won't buy the coupon.

 **Test case $4$:**  The original cost of the items is $140$, the coupon costs $10$, and the cost of buying everything after using the coupon is $0$. Since $10 + 0 \lt 140$, Chef will buy the coupon.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T14:22:50.846Z  

```java
class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        // write your code here 
        int save = 0;
        for(int i = 0; i < n; i++){
            if(prices[i] >= y){
                save += y;
            }
            else save += prices[i];
        }
        if(save > x) return "COUPON";
        else return "NO COUPON";
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DISCOUNTT)