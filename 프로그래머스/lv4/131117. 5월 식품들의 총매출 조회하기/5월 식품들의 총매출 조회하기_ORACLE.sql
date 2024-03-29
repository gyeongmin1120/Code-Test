SELECT
    P.PRODUCT_ID,
    P.PRODUCT_NAME,
    O.AMOUNT * PRICE AS TOTAL_SALES
FROM (
       SELECT
            PRODUCT_ID,
            SUM(AMOUNT) AS AMOUNT
        FROM
            FOOD_ORDER
        WHERE
            TO_CHAR(PRODUCE_DATE, 'YYYY-MM-DD') >= '2022-05-01' 
            AND TO_CHAR(PRODUCE_DATE, 'YYYY-MM-DD') <= '2022-05-31'
        GROUP BY
            PRODUCT_ID
    ) O 
    INNER JOIN FOOD_PRODUCT P
    ON O.PRODUCT_ID = P.PRODUCT_ID
ORDER BY
    TOTAL_SALES DESC,
    PRODUCT_ID ASC
