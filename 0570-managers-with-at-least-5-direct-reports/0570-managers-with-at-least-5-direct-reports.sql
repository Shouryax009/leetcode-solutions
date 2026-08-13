# Write your MySQL query statement below
select e.name as name 
from employee e 
join (
    select managerid 
    from employee
    group by managerid
    having count(*)>=5
)x
on e.id = x.managerid;