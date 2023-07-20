SELECT
    I.REST_ID,
    REST_NAME, 
    FOOD_TYPE,
    FAVORITES,
    ADDRESS,
    SCORE
FROM
    REST_INFO I INNER JOIN (
        SELECT
            REST_ID, 
            ROUND(AVG(REVIEW_SCORE), 2) AS SCORE
        FROM
            REST_REVIEW
        GROUP BY
            REST_ID
    )R
    ON I.REST_ID = R.REST_ID
WHERE
    ADDRESS LIKE '서울%'
ORDER BY
    SCORE DESC, 
    FAVORITES DESC





