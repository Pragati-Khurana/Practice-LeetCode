/* Write your T-SQL query statement below */
with cte as
(
    select p.product_id, coalesce(p.price*u.units, 0) as totalPrice, coalesce(u.units, 0) as units
    from Prices p
    left join UnitsSold u
        on p.product_id = u.product_id
        and u.purchase_date between start_date and end_date
)
select product_id, 
case
    when sum(totalPrice)=0 or sum(units)=0 then 0
    else cast(cast(sum(totalPrice) as decimal(10, 2))/ cast(sum(units) as decimal(10, 2)) as decimal(10, 2))
end as average_price
from cte
group by product_id;