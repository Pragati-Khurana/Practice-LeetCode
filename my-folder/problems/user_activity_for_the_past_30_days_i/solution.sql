/* Write your T-SQL query statement below */
select activity_date as day, count(distinct user_id) as active_users
from Activity
WHERE activity_date between '2019-06-28' AND '2019-07-27'
group by activity_date
order by activity_date asc;