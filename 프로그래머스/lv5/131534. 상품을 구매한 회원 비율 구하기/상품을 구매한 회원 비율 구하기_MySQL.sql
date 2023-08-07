SELECT
    B.*,
    ROUND(B.PUCHASED_USERS / C.TOTAL, 1) AS PUCHASED_RATIO
FROM
    (
        SELECT COUNT( USER_ID) AS TOTAL
        FROM USER_INFO 
        WHERE DATE_FORMAT(JOINED, '%Y-%m-%d') BETWEEN '2021-01-01' AND '2021-12-31' 
    ) C,
    (
        SELECT 
            YEAR(SALES_DATE) AS YEAR,
            MONTH(SALES_DATE) AS MONTH,
            COUNT( DISTINCT S.USER_ID) AS PUCHASED_USERS
        FROM
            (
                SELECT
                    USER_ID
                FROM
                    USER_INFO
                WHERE
                    DATE_FORMAT(JOINED, '%Y-%m-%d') BETWEEN '2021-01-01' AND '2021-12-31' 
            )A INNER JOIN ONLINE_SALE S
            ON A.USER_ID = S.USER_ID 
         GROUP BY
             YEAR(SALES_DATE),
             MONTH(SALES_DATE)
    ) B
ORDER BY
    YEAR,
    MONTH
