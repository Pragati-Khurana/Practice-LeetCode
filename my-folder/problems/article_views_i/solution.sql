/* Write your T-SQL query statement below */
select distinct author_id as id from views
where author_id = viewer_id
order by author_id;