SELECT 
    B. DATETIME
FROM (
    SELECT 
        @rownum:=@rownum+1 AS RN,
        A.DATETIME
    FROM
        ANIMAL_INS A,
        (SELECT @rownum:=0) R
    ORDER BY 
        DATETIME DESC
    ) B
WHERE B.RN = 1;
