-- Last updated: 21/09/2026, 15:16:48
# Write your MySQL query statement below
select patient_id,patient_name,conditions
from patients 
where conditions like 'DIAB1%'
OR conditions like '% DIAB1%';
