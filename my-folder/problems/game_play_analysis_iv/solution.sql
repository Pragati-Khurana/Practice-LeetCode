/* Write your T-SQL query statement below */
with cte0 as
(
    select player_id, min(event_date) as event_date from Activity
    group by player_id
),
cte as
(
    select player_id, event_date,
    case
        when exists(select 1 from Activity a2
        where a2.event_date=DATEADD(day, 1, a1.event_date)
        and a1.player_id=a2. player_id) then 1
        else 0
    end as loggedInNextDay
    from cte0 a1
)
,cte2 as
(
    select player_id, sum(loggedInNextDay) as loggedInNextDay
    from cte
    group by player_id
)
select coalesce(round(sum(case when loggedInNextDay<>0 then loggedInNextDay end) * 1.0 /count(loggedInNextDay), 2), 0) as fraction
from cte2