-- Last updated: 21/09/2026, 15:18:59
# Write your MySQL query statement below
select e.name,b.bonus
From Employee e
LEFT JOIN  bonus b 
ON e.empId=b.empId  
where b.bonus IS NULL or b. bonus <1000;
