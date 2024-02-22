# 평균 대여 기간 7일 이상 (AVERAGE_DURATION)
# 평균 대여 기간 소수점 두번째 반올림
# 평균 대여 기간 내림차순 / 자동차 아이디 내림차순

SELECT CAR_ID, ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1) AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
HAVING AVERAGE_DURATION >= 7
ORDER BY 2 DESC, 1 DESC