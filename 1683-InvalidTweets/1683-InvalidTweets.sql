-- Last updated: 21/09/2026, 15:16:30
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content)>15;