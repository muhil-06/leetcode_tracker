-- Last updated: 21/09/2026, 15:17:22
# Write your MySQL query statement below
SELECT DISTINCT author_id 
AS id
FROM Views
WHERE author_id=viewer_id 
ORDER BY  id  ASC;