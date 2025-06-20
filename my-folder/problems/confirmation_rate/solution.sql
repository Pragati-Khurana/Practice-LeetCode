/* Write your T-SQL query statement below */
with cte as
(
    select s.user_id,
    cast(count(case when action='confirmed' then action end) as decimal(10, 2)) as totalC, 
    cast(count(action) as decimal(10, 2)) as total
    from Signups s
    left join Confirmations c
        on s.user_id = c.user_id
    group by s.user_id
)
select user_id,
case
    when totalC=0 then 0.00
    else cast((totalC/total) as decimal(10, 2))
end as confirmation_rate
from cte;