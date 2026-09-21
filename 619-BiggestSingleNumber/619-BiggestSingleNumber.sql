-- Last updated: 21/09/2026, 15:18:46
# Write your MySQL query statement below
SELECT MAX(NUM) AS num
FROM MYNUMBERS
WHERE  NUM IN(
    SELECT  num FROM MYNUMBERS 
    GROUP BY NUM 
    HAVING COUNT(*)=1
);


