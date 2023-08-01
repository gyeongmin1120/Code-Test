SELECT
    (SELECT MEMBER_NAME FROM MEMBER_PROFILE WHERE MEMBER_ID = R.MEMBER_ID) AS MEMEBER_NAME,
    REVIEW_TEXT,
    TO_CHAR(REVIEW_DATE, 'YYYY-MM-DD') AS REVIEW_DATE
FROM
    REST_REVIEW R
WHERE
    MEMBER_ID IN (
        SELECT
            MEMBER_ID
        FROM 
            REST_REVIEW
        GROUP BY
            MEMBER_ID
        HAVING
            COUNT(REVIEW_ID) IN (
                SELECT
                    MAX(COUNT(REVIEW_ID))
                FROM
                    REST_REVIEW
                GROUP BY
                    MEMBER_ID
            )
    )
ORDER BY
    REVIEW_DATE,
    REVIEW_TEXT
    
    
    
    