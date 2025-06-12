/* Write your T-SQL query statement below */
with cte as
(
    select *, dense_rank() over(order by salary desc) as rn
    from Employee
)
select MAX(CASE WHEN rn = 2 THEN salary ELSE NULL END) as SecondHighestSalary
from cte where rn=2;