# Write your MySQL query statement below
select distinct s1.*
from stadium s1
join stadium s2 
    on s2.id = s1.id+1
join stadium s3 
    on s3.id = s1.id +2
where 
    s1.people >= 100 and s2.people >=100 and s3.people >=100
union
    select distinct s1.*
    from stadium s1
    join stadium s2 
    on s2.id = s1.id-1
    join stadium s3 
    on s3.id = s1.id -2
    where s1.people >= 100 and s2.people >=100 and s3.people >=100
union 
    select distinct s1.*
    from stadium s1
    join stadium s2 
    on s2.id = s1.id-1
    join stadium s3 
    on s3.id = s1.id +1
    where s1.people >= 100 and s2.people >=100 and s3.people >=100
order by visit_date ;