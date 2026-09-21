-- Last updated: 21/09/2026, 15:16:51
# Write your MySQL query statement below
select user_id,name,mail from users
where mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
and mail like binary '%@leetcode.com';