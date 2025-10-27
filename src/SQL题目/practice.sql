--第一题
select product_id from Products where low_fats = 'Y' and recyclable = 'Y';
--第二题
select name from Customer where referee_id != 2 or referee_id is null;
--第三题
select name, population, area from World where area >= 3000000 or population >= 25000000 ;
--第四题
SELECT DISTINCT author_id AS id FROM Views WHERE author_id = viewer_id ORDER BY id asc;
--第五题
select tweet_id from Tweets where length(content) > 15;
--第六题
select EmployeeUNI.unique_id, Employees.name from Employees left join EmployeeUNI on Employees.id = EmployeeUNI.id;
--第七题
select Product.product_name, Sales.year, Sales.price from Sales left join Product on Sales.product_id = Product.product_id;
--第八题
select customer_id, count(*) as count_no_trans from Visits left join Transactions on Visits.visit_id = Transactions.visit_id where Transactions.transaction_id is null group by customer_id;
--第九题
select w1.id from Weather w1, Weather w2 where w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY) and w1.temperature > w2.temperature;
--第十题
select a1.machine_id as machine_id, round(avg(a2.timestamp - a1.timestamp), 3)
 as processing_time from Activity as a1 inner join Activity as a2
  on a1.machine_id = a2.machine_id
   and a1.process_id = a2.process_id
   and a1.activity_type = 'start' and a2.activity_type = 'end'
   group by a1.machine_id;
--第十一题
select name, bonus from Employee left join Bonus on Employee.empid = Bonus.empid where bonus < 1000 or bonus is null;
--第十二题
select s.student_id, s.student_name, sub.subject_name, IFNULL(grouped.attended_exams, 0) as attended_exams
from Students s
cross join subjects sub
left join(
    select student_id, subject_name, count(*) as attended_exams
    from Examinations
    group by student_id, subject_name
)grouped
on s.student_id = grouped.student_id and sub.subject_name = grouped.subject_name
order by s.student_id, sub.subject_name;
--第十三题
select Name
from(
    select Manager.Name as Name , count(Report.Id)as cnt
    from Employee as Manager join  Employee as Report
    on Manager.Id = Report.ManagerId
    group by Manager.Id
)as t
where cnt >= 5
--第十四题
