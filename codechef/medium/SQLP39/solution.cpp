
select fv.user_id, urs.name, fv.property_id, prop.title, prop.location
from Users urs join Favorites fv on urs.user_id = fv.user_id 
join Properties prop on fv.property_id = prop.property_id
where prop.rating in(
    select property_id from Reviews
    group by property_id
    having avg(rating) > 4
)
order by fv.property_id asc;