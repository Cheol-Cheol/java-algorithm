# 식품분류별 가격이 제일 비싼 식품 조회
# 식품분류 '과자', '국', '김치', '식용유'
# 식품 가격 기준 내림차순

SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (CATEGORY, PRICE) IN (SELECT CATEGORY, MAX(PRICE)
                            FROM FOOD_PRODUCT
                            WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
                            GROUP BY CATEGORY )
ORDER BY PRICE DESC