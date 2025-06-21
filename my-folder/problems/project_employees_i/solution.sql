/* Write your T-SQL query statement below */
select p.project_id, cast(cast(sum(e.experience_years) as decimal(10, 2)) / cast(count(e.employee_id) as decimal(10, 2)) as decimal(10, 2)) as average_years
from Project p
inner join Employee e
    on p.employee_id = e.employee_id
group by p.project_id;