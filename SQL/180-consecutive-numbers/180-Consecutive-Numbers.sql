# Write your MySQL query statement below
SELECT
    DISTINCT num AS 'ConsecutiveNums'
FROM (
    SELECT
        num,
        LAG(num, 1) OVER(ORDER BY id) prev,
        LEAD(num, 1) OVER(ORDER BY id) next
    FROM Logs
) AS t
WHERE num = prev AND num = next;