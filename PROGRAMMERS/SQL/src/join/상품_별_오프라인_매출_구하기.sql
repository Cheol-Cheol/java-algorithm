# 상품코드 별 매출액(판매가 * 판매량) 합계 출력
# 매출액 기준 내림차순 / 상품코드 기준 오름차순

SELECT P.PRODUCT_CODE, (P.PRICE * SUM(S.SALES_AMOUNT)) SALES
FROM PRODUCT P
         JOIN OFFLINE_SALE S
              ON P.PRODUCT_ID = S.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY 2 DESC, 1