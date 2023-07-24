SELECT 
    A.APNT_NO,
    P.PT_NAME,
    P.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
    --TO_CHAR(A.APNT_YMD, 'YYYY-MM-DD HH24:MI:SS.FF6') AS APNT_YMD
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
            AND TO_CHAR(APNT_YMD, 'YYYY-MM-DD') = '2022-04-13'
            AND (APNT_CNCL_YN = 'N' OR APNT_CNCL_YMD IS NULL) 
     ) A
     INNER JOIN
     PATIENT P
     ON A.PT_NO = P.PT_NO
     INNER JOIN
     DOCTOR D
     ON A.MDDR_ID = D.DR_ID 
     --AND A.MCDP_CD = D.MCDP_CD
ORDER BY
    APNT_YMD