/* Write your T-SQL query statement below */
with cte as
(
    select customer_id, MIN(order_date) as od
    from Delivery
    group by customer_id
)
select
round(count(case when c.od=d.customer_pref_delivery_date then d.delivery_id end) * 100.0 / count(*), 2) as immediate_percentage
from cte c
inner join Delivery d
    on c.customer_id = d.customer_id
    and d.order_date = c.od