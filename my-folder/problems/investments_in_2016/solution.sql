with cte1 as (
    select lat, lon
    from Insurance
    group by lat, lon
    having count(*)=1
), cte2 as (
    select tiv_2015
    from Insurance i
    group by tiv_2015
    having count(*)>1
)
select round(sum(tiv_2016), 2) as tiv_2016
from Insurance i
inner join cte1 c1
    on c1.lat = i.lat
    and c1.lon = i.lon
inner join cte2 c2
    on c2.tiv_2015 = i.tiv_2015