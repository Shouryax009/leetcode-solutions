# Write your MySQL query statement below
select 
    c1.id,
    c1.movie,
    c1.description,
    c1.rating
from cinema c1
where (c1.id%2)<>0 && c1.description<>"boring"
order by c1.rating desc;