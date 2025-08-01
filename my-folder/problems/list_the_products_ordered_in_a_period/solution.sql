/* Write your T-SQL query statement below */
select p.product_name, sum(o.unit) as unit
from Orders o
inner join Products p
    on p.product_id = o.product_id
where o.order_date between '2020-02-01' and '2020-02-29'
group by p.product_name
having sum(o.unit) >= 100;