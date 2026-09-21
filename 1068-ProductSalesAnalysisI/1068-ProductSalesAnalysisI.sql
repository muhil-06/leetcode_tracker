-- Last updated: 21/09/2026, 15:17:36
# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price
From Sales s
INNER JOIN Product p
ON s.product_id=p.product_id;
