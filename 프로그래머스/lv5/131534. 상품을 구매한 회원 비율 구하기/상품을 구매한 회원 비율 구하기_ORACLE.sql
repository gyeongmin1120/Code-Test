SELECT
    B.*,
    ROUND(B.PUCHASED_USERS / C.TOTAL, 1) AS PUCHASED_RATIO
FROM
    (
        SELECT COUNT( USER_ID) AS TOTAL
        FROM USER_INFO 
        WHERE TO_CHAR(JOINED, 'YYYY-MM-DD') BETWEEN '2021-01-01' AND '2021-12-31' 
    ) C,
    (
        SELECT 
            EXTRACT(YEAR FROM CAST(SALES_DATE AS TIMESTAMP)) AS YEAR,
            EXTRACT(MONTH FROM CAST(SALES_DATE AS TIMESTAMP)) AS MONTH,
            COUNT( DISTINCT S.USER_ID) AS PUCHASED_USERS
        FROM
            (
                SELECT
                    USER_ID
                FROM
                    USER_INFO
                WHERE
                    TO_CHAR(JOINED, 'YYYY-MM-DD') BETWEEN '2021-01-01' AND '2021-12-31' 
            )A INNER JOIN ONLINE_SALE S
            ON A.USER_ID = S.USER_ID 
         GROUP BY
             EXTRACT(YEAR FROM CAST(SALES_DATE AS TIMESTAMP)),
             EXTRACT(MONTH FROM CAST(SALES_DATE AS TIMESTAMP))
    ) B
ORDER BY
    YEAR,
    MONTH
