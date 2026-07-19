# Write your MySQL query statement below
select e.name as Employee from employee e where e.salary > (select salary from employee where id = e.managerId);