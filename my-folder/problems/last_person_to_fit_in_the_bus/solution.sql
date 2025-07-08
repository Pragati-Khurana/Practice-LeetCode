/* Write your T-SQL query statement below */
with cte as
(
    select *, sum(weight) over(order by turn) as sumWeight
    from Queue
)
select top 1 person_name
from cte
where sumWeight <= 1000
order by turn desc