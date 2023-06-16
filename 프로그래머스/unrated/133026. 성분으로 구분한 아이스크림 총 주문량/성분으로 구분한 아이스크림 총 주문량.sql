SELECT
    I.INGREDIENT_TYPE,
    SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM
    FIRST_HALF F LEFT JOIN ICECREAM_INFO I
    ON  F.FLAVOR = I.FLAVOR
GROUP BY
    I.INGREDIENT_TYPE
ORDER BY
    TOTAL_ORDER
