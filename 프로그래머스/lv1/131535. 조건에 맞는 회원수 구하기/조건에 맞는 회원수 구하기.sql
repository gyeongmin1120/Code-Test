SELECT 
   COUNT(USER_ID)
FROM 
    USER_INFO
WHERE 
    TO_CHAR(JOINED) LIKE '%21'
    AND AGE BETWEEN 20 AND 29