# Invalid Transactions

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A transaction is possibly invalid if:

- the amount exceeds $1000, or;
- if it occurs within (and including) 60 minutes of another transaction with the same name in a different city.

You are given an array of strings `transaction` where `transactions[i]` consists of comma-separated values representing the name, time (in minutes), amount, and city of the transaction.

Return a list of `transactions` that are possibly invalid. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
Output: ["alice,20,800,mtv","alice,50,100,beijing"]
Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
```

 **Example 2:** 

```
Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
Output: ["alice,50,1200,mtv"]

```

 **Example 3:** 

```
Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
Output: ["bob,50,1200,mtv"]

```

 

 **Constraints:** 

- transactions.length <= 1000
- Each transactions[i] takes the form "{name},{time},{amount},{city}"
- Each {name} and {city} consist of lowercase English letters, and have lengths between 1 and 10.
- Each {time} consist of digits, and represent an integer between 0 and 1000.
- Each {amount} consist of digits, and represent an integer between 0 and 2000.

## Solution

**Language:** Java  
**Runtime:** 22 ms (beats 51.02%)  
**Memory:** 47.1 MB (beats 72.97%)  
**Submitted:** 2026-10-03T10:16:03.743Z  

```java
class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        Transaction[] t = new Transaction[n];
        boolean[] invalid = new boolean[n];
        for(int i = 0; i < n; i++){
            t[i] = new Transaction(transactions[i]);
            if(t[i].amount > 1000){
                invalid[i] = true;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(Math.abs(t[i].time - t[j].time) <= 60 && 
                t[i].name.equals(t[j].name) && !t[i].city.equals(t[j].city)){
                    invalid[i] = true;
                    invalid[j] = true;
                }
            }
        }
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            if(invalid[i]) res.add(transactions[i]);
        }
        return res;
    }
}

class Transaction{
    String transaction;
    String name;
    int time;
    int amount;
    String city;

    Transaction(String transaction){
        this.transaction = transaction;
        String[] tr = transaction.split(",");
        name = tr[0];
        time = Integer.parseInt(tr[1]);
        amount = Integer.parseInt(tr[2]);
        city = tr[3];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/invalid-transactions/)