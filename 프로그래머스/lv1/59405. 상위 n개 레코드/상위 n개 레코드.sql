-- 코드를 입력하세요

SELECT A.NAME
FROM(
    SELECT row_number() over(order by DATETIME) as RN, NAME
    FROM ANIMAL_INS
)A
WHERE RN = 1