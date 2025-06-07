/* Write your T-SQL query statement below */
select name from SalesPerson
where sales_id not in (select distinct sales_id from Orders
where com_id in (select distinct com_id from Company
where name = 'RED'))