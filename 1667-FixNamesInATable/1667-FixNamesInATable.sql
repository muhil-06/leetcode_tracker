-- Last updated: 21/09/2026, 15:16:34
# Write your MySQL query statement below
select user_id, CONCAT(
    upper(left(name,1)),
    lower(substring(name,2))) as name
from users
order by user_id asc;
