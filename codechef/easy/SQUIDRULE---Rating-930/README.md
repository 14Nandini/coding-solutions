# SQUIDRULE - Rating 930

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:44:39.459Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            // Your code goes here
            boolean isValid = true;
            for(int i = 1; i < n; i++){
                if(d[i - 1] > d[i]){
                    isValid = false;
                    break;
                }
            }
            if(isValid) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SQUIDRULE)