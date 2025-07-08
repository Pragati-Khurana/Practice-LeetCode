/* Write your T-SQL query statement below */
with cte as
(
    select
        count(case when income < 20000 then account_id end) as LowSalary,
        count(case when (income >= 20000 and income <=50000) then account_id end) as AverageSalary,
        count(case when income > 50000 then account_id end) as HighSalary
    from Accounts
)
select 'Low Salary' as category, LowSalary as accounts_count from cte
Union All
select 'Average Salary' as category, AverageSalary as accounts_count from cte
Union All
select 'High Salary' as category, HighSalary as accounts_count from cte