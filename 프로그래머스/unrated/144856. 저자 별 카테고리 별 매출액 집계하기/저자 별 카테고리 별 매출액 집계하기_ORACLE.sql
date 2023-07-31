SELECT
    A.AUTHOR_ID,
    AUTHOR_NAME,
    CATEGORY,
    SUM(TOTAL_SALES)
FROM
    (
        SELECT
            B.BOOK_ID,
            B.AUTHOR_ID,
            B.CATEGORY,
            SUM(SALES) * B.PRICE AS TOTAL_SALES
        FROM
            BOOK B INNER JOIN BOOK_SALES S
            ON B.BOOK_ID = S.BOOK_ID
        WHERE
            TO_CHAR(SALES_DATE, 'YYYY-MM-DD') >= '2022-01-01'
            AND TO_CHAR(SALES_DATE, 'YYYY-MM-DD') <= '2022-01-31'
        GROUP BY
            B.BOOK_ID,
            B.AUTHOR_ID,
            B.CATEGORY,
            B.PRICE
    ) S INNER JOIN AUTHOR A
    ON S.AUTHOR_ID = A.AUTHOR_ID
GROUP BY
    A.AUTHOR_ID,
    AUTHOR_NAME,
    CATEGORY
ORDER BY
    A.AUTHOR_ID,
    CATEGORY DESC
