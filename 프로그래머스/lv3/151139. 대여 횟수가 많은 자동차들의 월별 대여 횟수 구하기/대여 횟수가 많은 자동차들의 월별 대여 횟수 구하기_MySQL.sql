SELECT
    EXTRACT(MONTH FROM START_DATE) AS MONTH,
    CAR_ID,
    COUNT(HISTORY_ID) AS RECORDS
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE CAR_ID IN (
    SELECT
        CAR_ID
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    WHERE
        DATE_FORMAT(START_DATE, '%Y-%m-%d') >= '2022-08-01'
        AND DATE_FORMAT(START_DATE, '%Y-%m-%d') <= '2022-10-31'
    GROUP BY
        CAR_ID
    HAVING
        COUNT(CAR_ID) >= 5
) 
AND DATE_FORMAT(START_DATE, '%Y-%m-%d') >= '2022-08-01' 
AND DATE_FORMAT(START_DATE, '%Y-%m-%d') <= '2022-10-31'
GROUP BY
    EXTRACT(MONTH FROM START_DATE),
    CAR_ID
HAVING 
    COUNT(HISTORY_ID) > 0
ORDER BY
    MONTH ASC,
    CAR_ID DESC

