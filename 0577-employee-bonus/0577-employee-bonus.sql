# Write your MySQL query statement below
select 
    e1.name as name,
    b1.bonus as bonus
from employee e1 
left join bonus b1 on 
e1.empid = b1.empid 
where b1.bonus < 1000 or b1.bonus is null;