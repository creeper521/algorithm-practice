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