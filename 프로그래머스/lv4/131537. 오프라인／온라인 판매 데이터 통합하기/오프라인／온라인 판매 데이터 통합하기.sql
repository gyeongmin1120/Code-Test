
    (SELECT
        DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE,
        PRODUCT_ID,
        USER_ID AS USER_ID,
        SALES_AMOUNT
    FROM
        ONLINE_SALE
    WHERE
        DATE_FORMAT(SALES_DATE, '%Y-%m-%d') >= '2022-03-01'
        AND DATE_FORMAT(SALES_DATE, '%Y-%m-%d') <= '2022-03-31'
    )
    UNION ALL

    (SELECT
        DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE,
        PRODUCT_ID,
        NULL AS USER_ID,
        SALES_AMOUNT
    FROM
        OFFLINE_SALE 
    WHERE
        DATE_FORMAT(SALES_DATE, '%Y-%m-%d') >= '2022-03-01'
        AND DATE_FORMAT(SALES_DATE, '%Y-%m-%d') <= '2022-03-31'
    )
    ORDER BY
        SALES_DATE,
        PRODUCT_ID,
        USER_ID




  