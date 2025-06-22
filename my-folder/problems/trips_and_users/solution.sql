/* Write your T-SQL query statement below */
select t.request_at as Day,
round(count(case when status like 'cancelled%' then status end) * 1.0/count(t.status), 2) as [Cancellation Rate]
from Trips t
inner join Users u
  on t.client_id = u.users_id
  and u.banned='No'
inner join Users d
  on t.driver_id = d.users_id
  and d.banned='No'
where request_at between '2013-10-01' and '2013-10-03'
group by request_at