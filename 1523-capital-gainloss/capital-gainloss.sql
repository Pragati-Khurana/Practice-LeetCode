/* Write your T-SQL query statement below */
with cte as (
    select
        stock_name,
        sum(case when operation='Buy' then price end) as Buy,
        sum(case when operation='Sell' then price end) as Sell
    from Stocks
    group by stock_name
)
select stock_name, Sell-Buy as capital_gain_loss
from cte;