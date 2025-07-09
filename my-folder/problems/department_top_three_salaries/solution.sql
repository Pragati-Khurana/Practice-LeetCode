/* Write your T-SQL query statement below */
with cte as
(
    select *, dense_rank() over(partition by departmentId order by salary desc) as rn
    from Employee
)
select d.name as Department, c.name as Employee, c.salary as Salary
from cte c
inner join Department d
    on d.id = c.departmentId
where c.rn<=3
order by Department, Salary desc