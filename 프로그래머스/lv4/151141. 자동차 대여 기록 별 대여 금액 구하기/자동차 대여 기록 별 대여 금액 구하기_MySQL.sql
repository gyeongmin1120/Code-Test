SELECT
    HISTORY_ID,
    ROUND(DAILY_FEE * ((100 - RATE) / 100) * PERIOD) AS FEE
FROM( 
    SELECT
        HISTORY_ID,
        A.DAILY_FEE,
        DATEDIFF(END_DATE, START_DATE) + 1 AS PERIOD,
        CASE
            WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 7  AND DATEDIFF(END_DATE, START_DATE) + 1 < 30 
            THEN (
                    SELECT DISCOUNT_RATE 
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
                    WHERE CAR_TYPE = '트럭' AND DURATION_TYPE = '7일 이상')
            WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 30  AND DATEDIFF(END_DATE, START_DATE) + 1 < 90  
            THEN (
                    SELECT DISCOUNT_RATE 
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
                    WHERE CAR_TYPE = '트럭' AND DURATION_TYPE = '30일 이상')
            WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 90
            THEN (
                    SELECT DISCOUNT_RATE 
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
                    WHERE CAR_TYPE = '트럭' AND DURATION_TYPE = '90일 이상')        
            ELSE 0 
            END AS RATE
    FROM
    (
        SELECT
            CAR_ID,
            DAILY_FEE
        FROM
            CAR_RENTAL_COMPANY_CAR 
        WHERE
            CAR_TYPE = '트럭'
    ) A INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
    ON A.CAR_ID = H.CAR_ID
)B
ORDER BY
    DAILY_FEE * ((100 - RATE) / 100) * PERIOD DESC,
    HISTORY_ID DESC
