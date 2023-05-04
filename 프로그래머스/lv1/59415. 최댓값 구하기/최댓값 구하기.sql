SELECT 
    DATETIME
FROM (
    SELECT 
        ROWNUM AS RN,
        DATETIME
    FROM (
        SELECT
           DATETIME
        FROM
            ANIMAL_INS
        ORDER BY
            DATETIME DESC
    )
)
WHERE RN = 1;