SELECT 
    F.flavor
FROM
    (
        SELECT
            flavor
        FROM 
            first_half
        WHERE
            total_order > 3000
        ORDER BY 
            total_order desc
    )F, icecream_info I
WHERE 
    I.ingredient_type = 'fruit_based'
    AND I.flavor = F.flavor