SELECT
    A.CAR_ID,
    A.CAR_TYPE,
    TRUNCATE(A.DAILY_FEE * (( 100 - P.DISCOUNT_RATE) / 100) * 30 ,-1) AS FEE
FROM
    (
        SELECT
            CAR_ID,
            CAR_TYPE,
            DAILY_FEE
        FROM
            CAR_RENTAL_COMPANY_CAR 
        WHERE
            CAR_ID NOT IN (
                SELECT
                    CAR_ID
                FROM
                    CAR_RENTAL_COMPANY_RENTAL_HISTORY
                WHERE
                    DATE_FORMAT(END_DATE, '%Y-%m-%d') >= '2022-11-01' 
                    -- END_DATE <= TO_DATE('2022-11-01', 'YYYY-MM-DD')
                    AND 
                    DATE_FORMAT(START_DATE, '%Y-%m-%d') <= '2022-11-30'
                    -- START_DATE <= TO_DATE('2022-11-30', 'YYYY-MM-DD')
            ) 
            AND CAR_TYPE IN ('세단', 'SUV')
        ) A JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
        ON A.CAR_TYPE = P.CAR_TYPE
WHERE
    P.DURATION_TYPE = '30일 이상'
    AND A.DAILY_FEE * (( 100 - P.DISCOUNT_RATE) / 100) * 30 >= 500000
    AND A.DAILY_FEE * (( 100 - P.DISCOUNT_RATE) / 100) * 30 < 2000000
ORDER BY
    FEE DESC,
    A.CAR_TYPE, 
    A.CAR_ID DESC