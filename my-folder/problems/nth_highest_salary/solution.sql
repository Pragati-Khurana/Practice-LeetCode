CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    DECLARE @res INT;
    
    with CTE as
    (
        select id, salary, dense_rank() over(order by salary desc) as rn
        from Employee
    )
    select @res = salary from cte
    where rn=@N;

    RETURN @res; 
END