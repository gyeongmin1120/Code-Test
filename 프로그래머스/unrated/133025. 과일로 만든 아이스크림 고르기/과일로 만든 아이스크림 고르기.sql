SELECT 
    F.FLAVOR
FROM
    (
        SELECT
            FLAVOR
        FROM 
            FIRST_HALF A
        WHERE
            TOTAL_ORDER >= 3000
        ORDER BY 
            TOTAL_ORDER
    )F, ICECREAM_INFO I
WHERE 
    I.INGREDIENT_TYPE = 'fruit_based'
    AND I.FLAVOR = F.FLAVOR