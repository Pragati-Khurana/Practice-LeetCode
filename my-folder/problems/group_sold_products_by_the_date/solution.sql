/* Write your T-SQL query statement below */
with cte as
(
    select distinct * from Activities
)
select
    sell_date,
    COUNT(distinct product) as num_sold,
    STRING_AGG(product, ',') within group(order by product) as products
from CTE
group by sell_date
order by sell_date;