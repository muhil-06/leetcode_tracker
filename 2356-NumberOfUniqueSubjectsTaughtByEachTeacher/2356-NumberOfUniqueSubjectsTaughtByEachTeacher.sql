-- Last updated: 21/09/2026, 15:15:45
# Write your MySQL query statement below
SELECT teacher_id,
COUNT(DISTINCT subject_id) as cnt
from teacher
group by teacher_id;