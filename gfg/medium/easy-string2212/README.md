# easy-string2212

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T16:03:02.719Z  

```java
class Solution {
    public String compressString(String s) {
        int count=1;
        String g=s.toLowerCase();
        StringBuilder sb=new StringBuilder ();
          for(int i=0;i<g.length()-1;i++){
              char ch=g.charAt(i);
              char ch1=g.charAt(i+1);
              if(ch==ch1){
                  count+=1;
              }
              else{
                  sb.append(ch);
                  String str=String.valueOf(count);
                  sb.append(str);
                  count=1;
          }
          }
          sb.append(g.charAt(g.length()-1));
          sb.append(count);


          return sb.toString();
    }

}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/easy-string2212/1)