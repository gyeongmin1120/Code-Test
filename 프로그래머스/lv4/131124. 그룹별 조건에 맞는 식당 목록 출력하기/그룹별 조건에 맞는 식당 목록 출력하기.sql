SELECT
    (SELECT MEMBER_NAME FROM MEMBER_PROFILE WHERE MEMBER_ID = R.MEMBER_ID) AS MEMEBER_NAME,
    REVIEW_TEXT,
    DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
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
                        MAX(R.REVIEW_ID)
                    FROM(
                         SELECT
                            MEMBER_ID,
                            COUNT(REVIEW_ID) AS REVIEW_ID
                        FROM
                            REST_REVIEW
                        GROUP BY
                            MEMBER_ID
                    ) R
            )
    )
ORDER BY
    REVIEW_DATE,
    REVIEW_TEXT
    
       
    
    
    
   
   
   