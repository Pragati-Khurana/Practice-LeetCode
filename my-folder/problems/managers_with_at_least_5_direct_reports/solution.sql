/* Write your T-SQL query statement below */
select mgr.name as name
from Employee emp
inner join Employee mgr
    on emp.managerId = mgr.id
group by mgr.id, mgr.name
having count(emp.id) >= 5;