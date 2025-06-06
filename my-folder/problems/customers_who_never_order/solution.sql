/* Write your T-SQL query statement below */
select name as Customers from Customers
where id not in (
select customerId
from Customers c, Orders o
    where c.id = o.customerId);