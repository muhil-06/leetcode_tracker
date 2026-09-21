-- Last updated: 21/09/2026, 15:19:57
# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee 
WHERE salary<(SELECT
    MAX(salary)
    FROM Employee 
    ); 