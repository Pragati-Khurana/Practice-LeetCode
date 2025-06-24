/* Write your T-SQL query statement below */
with cte as
(
    select product_id, MIN(year) as first_year
    from Sales
    group by product_id
)
select c.product_id, c.first_year, s.quantity, s.price
from cte c
inner join Sales s
    on s.product_id = c.product_id
    and c.first_year = s.year