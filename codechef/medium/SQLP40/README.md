# SQLP40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Farmhouse Booking Analysis September SQL challenge
### Task

Provide a list of properties that are mentioned as " **farmhouse** " in the property title and meet the following criteria:

- The properties must have at least a 4.5 rating.
- They should be booked for dates between September 1, 2023, and September 30, 2023.
- You can refer to the dataset here.
### Output Format

property_id
title
rating
location

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T15:00:13.303Z  

```sql
-- your code goes here
select property_id, title, rating, location
from Properties
where 
title like '%farmhouse' and
rating >= 4.5 and
property_id in 
(select property_id from Bookings 
where start_date >= '2023-09-01' and end_date <= '2023-09-30');
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP40)