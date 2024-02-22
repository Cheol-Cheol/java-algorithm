# 2022년 4월 13일 취소되지 않은 CS 진료 예약 내역 조회
# 진료예약일시 기준 오름차순

SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM PATIENT P
         JOIN APPOINTMENT A
              ON P.PT_NO = A.PT_NO
         JOIN DOCTOR D
              ON D.DR_ID = A.MDDR_ID
WHERE 1 = 1
  AND A.APNT_YMD LIKE '2022-04-13%'
  AND A.MCDP_CD = 'CS'
  AND A.APNT_CNCL_YN = 'N'
ORDER BY APNT_YMD