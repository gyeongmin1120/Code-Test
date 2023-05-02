SELECT 
    BOOK_ID,
    TO_CHAR(PUBLISHED_DATE, 'yyyy-MM-dd') AS PUBLISHED_DATE
FROM
    BOOK
WHERE
    CATEGORY = '인문'
    AND TO_CHAR(PUBLISHED_DATE, 'yyyy-MM-dd') LIKE '2021%'
ORDER BY PUBLISHED_DATE