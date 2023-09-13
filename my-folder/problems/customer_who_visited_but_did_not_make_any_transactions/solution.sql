# Write your MySQL query statement below
# select v.customer_id, count() from Visits v

select customer_id, count(customer_id) as count_no_trans
from Visits
where visit_id not in
(select visit_id from Transactions)
group by customer_id
order by count(customer_id) desc

# select v.visit_id from Visits v
# inner join Transactions t
# on v.visit_id<>t.visit_id