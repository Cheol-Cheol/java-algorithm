# 5월 1일 기준 = CASE VALUE
# 5월 1일 까지는 출고완료 / 이후 날짜는 출고대기 / 미정이면 출고미정 = CASE
# 주문 아이디 기준 오름차순

SELECT ORDER_ID,
       PRODUCT_ID,
       DATE_FORMAT(OUT_DATE, '%Y-%m-%d') OUT_DATE,
       CASE
           WHEN DATEDIFF(OUT_DATE, '2022-05-01') + 1 <= 1 THEN '출고완료'
           WHEN DATEDIFF(OUT_DATE, '2022-05-01') + 1 > 1 THEN '출고대기'
           WHEN OUT_DATE IS NULL THEN '출고미정'
           END 출고여부
FROM FOOD_ORDER
ORDER BY 1