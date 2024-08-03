# Write your MySQL query statement bel
select customers.name as Customers from customers where id not in (select customers.id from Customers inner join Orders on Customers.id = orders.customerId)