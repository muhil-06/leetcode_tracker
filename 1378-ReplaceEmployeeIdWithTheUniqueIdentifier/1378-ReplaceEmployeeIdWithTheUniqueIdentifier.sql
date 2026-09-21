-- Last updated: 21/09/2026, 15:17:02
# Write your MySQL query statement below
select eu.unique_id,e.name from employees e
left join  employeeuni eu
on e.id=eu.id;

