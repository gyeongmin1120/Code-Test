SELECT 
    A.APNT_NO,
    P.PT_NAME,
    P.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
FROM
    (
        SELECT
            APNT_NO,
            PT_NO,
            MCDP_CD,
            MDDR_ID,
            APNT_YMD
        FROM
            APPOINTMENT
        WHERE
            MCDP_CD = 'CS'
            AND DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13'
            AND (APNT_CNCL_YN = 'N' OR APNT_CNCL_YMD IS NULL) 
     ) A
     INNER JOIN
     PATIENT P
     ON A.PT_NO = P.PT_NO
     INNER JOIN
     DOCTOR D
     ON A.MDDR_ID = D.DR_ID
ORDER BY
    APNT_YMD