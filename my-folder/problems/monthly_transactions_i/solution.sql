/* Write your T-SQL query statement below */
select
    format(trans_date, 'yyyy-MM') as month,
    country,
    count(*) as trans_count,
    count(case when state='approved' then id end) as approved_count,
    sum(amount) as trans_total_amount,
    coalesce(sum(case when state='approved' then amount end), 0) as approved_total_amount
from Transactions
group by format(trans_date, 'yyyy-MM'), country
order by format(trans_date, 'yyyy-MM'), country desc