SELECT
    DISTINCT(C.CAR_ID) AS CAR_ID
FROM
    CAR_RENTAL_COMPANY_CAR C,
    CAR_RENTAL_COMPANY_RENTAL_HISTORY H
WHERE
    C.CAR_ID = H.CAR_ID
    AND CAR_TYPE = '세단'
    AND MONTH(START_DATE) = '10'
ORDER BY
    CAR_ID DESC