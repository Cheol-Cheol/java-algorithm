# 2022년 5월 예약한 환자 수를 진료과코드 별로 조회
# 진료과별 예약한 환자 수 기준 오름차순 / 진료과 코드 기준 오름차순

SELECT MCDP_CD, COUNT(*) 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD BETWEEN '2022-05-01' AND '2022-05-31'
GROUP BY MCDP_CD
ORDER BY 2, 1