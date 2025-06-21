/* Write your T-SQL query statement below */
select contest_id, cast(count(user_id)*100.0/(select count(user_id) from Users) as decimal(10, 2)) as percentage
from Register
group by contest_id
order by percentage desc, contest_id asc;