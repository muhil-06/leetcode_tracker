-- Last updated: 21/09/2026, 15:18:52
# Write your MySQL query statement below
SELECT name 
FROM Customer
WHERE referee_id!=2 OR referee_id IS NULL;