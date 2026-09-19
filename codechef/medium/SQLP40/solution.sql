-- your code goes here
select property_id, title, rating, location
from Properties
where 
title like '%farmhouse' and
rating >= 4.5 and
property_id in 
(select property_id from Bookings 
where start_date >= '2023-09-01' and end_date <= '2023-09-30');