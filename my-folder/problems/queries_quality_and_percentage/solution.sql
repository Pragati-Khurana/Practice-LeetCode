/* Write your T-SQL query statement below */
with cte as
(
    select query_name, count(*) as poorQRec
    from Queries
    where rating<3
    group by query_name
)
select q.query_name, round(sum(rating*1.0/position)/count(q.position), 2) as quality, coalesce(round(max(poorQRec) * 100.0/ count(q.position), 2), 0) as poor_query_percentage
from Queries q
left join cte c
    on c.query_name = q.query_name
group by q.query_name