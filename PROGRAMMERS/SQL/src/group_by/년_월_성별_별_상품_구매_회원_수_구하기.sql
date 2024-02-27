# 년, 월, 성별 별로 상품을 구매한 회원수 집계
# 동일한 날짜, 회원 ID, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.
# 년, 월, 성별 기준 오름차순
# 성별 정보가 없으면 제외

SELECT  YEAR(SALES_DATE) YEAR,
        MONTH(SALES_DATE) MONTH,
        GENDER,
        COUNT(DISTINCT I.USER_ID) USERS
FROM USER_INFO I
         JOIN ONLINE_SALE S
              ON I.USER_ID = S.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY 1, 2, 3
ORDER BY 1, 2, 3
