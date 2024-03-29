SELECT
    EXTRACT(YEAR FROM SALES_DATE) AS YEAR
    , EXTRACT(MONTH FROM SALES_DATE) AS MONTH
    , GENDER
    , COUNT(DISTINCT O.USER_ID) AS USERS
FROM
    USER_INFO U INNER JOIN ONLINE_SALE O
    ON U.USER_ID = O.USER_ID
WHERE
    GENDER IS NOT NULL
GROUP BY
    EXTRACT(YEAR FROM SALES_DATE),
    EXTRACT(MONTH FROM SALES_DATE),
    GENDER
ORDER BY
    YEAR, MONTH, GENDER
