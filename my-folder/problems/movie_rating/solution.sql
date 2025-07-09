/* Write your T-SQL query statement below */
with cte as
(
        select user_id, count(user_id) as countUser, rank() over(order by count(user_id) desc) as rn
    from MovieRating
    group by user_id
), cte2 as (
    select 
        movie_id,
        avg(cast(rating as decimal(10, 2))) as avg,
        rank() over(order by avg(cast(rating as decimal(10, 2))) desc) as rn
    from MovieRating
    where created_at between '2020-02-01' and '2020-02-29'
    group by movie_id
)

select * from (
    select top 1 name as results from Users
    where user_id in (
        select user_id from cte
        where rn=1
    )
    order by name
) as r1

union all

select * from (
    select top 1 title as results from Movies
    where movie_id in (
        select movie_id from cte2
        where rn=1
    )
    order by title
) as r2