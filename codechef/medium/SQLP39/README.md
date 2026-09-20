# SQLP39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Advanced SQL Subquery Favorites Filter
### Task

Retrieve users who have favorited properties with an average rating greater than 4, including property details.
Arrange the results in ascending order based on the property IDs.

- You can refer to the dataset here.
### Output Format

user_id
name
property_id
title
location

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T13:55:47.147Z  

```cpp

select fv.user_id, urs.name, fv.property_id, prop.title, prop.location
from Users urs join Favorites fv on urs.user_id = fv.user_id 
join Properties prop on fv.property_id = prop.property_id
where prop.rating in(
    select property_id from Reviews
    group by property_id
    having avg(rating) > 4
)
order by fv.property_id asc;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP39)