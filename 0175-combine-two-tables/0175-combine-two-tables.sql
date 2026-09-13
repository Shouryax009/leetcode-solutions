# Write your MySQL query statement below
SELECT
    p.firstname,
    p.lastname,
    a.city,
    a.state
FROM Person p
    left join address a 
    on p.personid = a.personid;