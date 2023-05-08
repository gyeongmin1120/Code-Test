SELECT 
    F.FLAVOR
FROM
    (
        SELECT
            FLAVOR
        FROM 
            FIRST_HALF
        WHERE
            TOTAL_ORDER > 3000
        ORDER BY 
            TOTAL_ORDER desc
    )F, ICECREAM_INFO I
WHERE 
    I.INGREDIENT_TYPE = 'fruit_based'
    AND I.FLAVOR = F.FLAVOR