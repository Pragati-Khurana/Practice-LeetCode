/* Write your T-SQL query statement below */
delete p1
from Person p1
inner join Person p2
    on p1.id>p2.id
    and p1.email=p2.email;