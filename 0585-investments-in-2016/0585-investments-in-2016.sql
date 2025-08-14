# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM (
    SELECT tiv_2016,
           COUNT(*) OVER(PARTITION BY tiv_2015) AS tiv_2015_count,
           COUNT(*) OVER(PARTITION BY lat, lon) AS city_count
    FROM Insurance
) AS InsuranceWithCounts
WHERE tiv_2015_count > 1
  AND city_count = 1;
  #partition is not similar to group by
  #group by aggregattes to a single row 
  # whereas partition is used within window function like SUM_OVER,RANK,ROW_NUMBER
  #partition does not aggresgates just keep all rows but splits the row into partition here it is done by tiv_2015_count