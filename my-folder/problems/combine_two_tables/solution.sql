/* Write your T-SQL query statement below */
select firstname, lastname, city, state
from person p
left join address a
    on a.personid=p.personid;