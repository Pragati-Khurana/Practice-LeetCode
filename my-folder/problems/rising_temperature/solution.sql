/* Write your T-SQL query statement below */
select w2.id as Id from Weather w1
inner join Weather w2
    on datediff(day, w1.recordDate, w2.recordDate) = 1
    and w2.temperature > w1.temperature;