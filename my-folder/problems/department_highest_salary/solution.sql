/* Write your T-SQL query statement below */
with cte as
(
    select d.name as Department, e.name as Employee, e.salary as Salary, rank() over(partition by departmentId order by salary desc) as rn
    from Employee e
    inner join Department d
        on e.departmentId = d.id
)
select Department, Employee, Salary from CTE
where rn=1;