# 조인 or 서브쿼리 / 세단 자동차 / 10월에 대여 시작
# 자동차 아이디 중복X / 내림차순

SELECT DISTINCT CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID IN (SELECT CAR_ID
                 FROM CAR_RENTAL_COMPANY_CAR
                 WHERE CAR_TYPE = '세단')
  AND START_DATE BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY 1 DESC