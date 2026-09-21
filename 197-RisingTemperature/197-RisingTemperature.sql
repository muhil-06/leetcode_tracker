-- Last updated: 21/09/2026, 15:19:46
# Write your MySQL query statement below
SELECT w1.id
from weather w1
JOIN weather w2
ON DATEDIFF(w1.recorddate,w2.recorddate)=1
where w1.temperature>w2.temperature;