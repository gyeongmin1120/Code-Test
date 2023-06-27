SELECT 
    B.ANIMAL_ID,
    B.NAME
FROM (
    SELECT
        A.*
        ,ROWNUM RM
    FROM (
        SELECT
            I.ANIMAL_ID,
            I.NAME
        FROM
            ANIMAL_INS I,
            ANIMAL_OUTS O
        WHERE
            I.ANIMAL_ID = O.ANIMAL_ID
            AND O.DATETIME >= I.DATETIME
        ORDER BY
            O.DATETIME - I.DATETIME DESC
    )A
)B
WHERE
    RM < 3
