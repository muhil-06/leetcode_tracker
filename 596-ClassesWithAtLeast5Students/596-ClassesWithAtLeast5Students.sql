-- Last updated: 21/09/2026, 15:18:49
# Write your MySQL query statement below
select class
from Courses 
group by class
having count(*)>=5;
