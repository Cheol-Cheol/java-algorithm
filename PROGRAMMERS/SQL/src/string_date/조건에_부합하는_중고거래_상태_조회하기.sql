# 2022년 10월 5일
# 거래상태 SALE - 판매중 / RESERVED - 예약중 / DONE - 거래완료 = CASE
# 게시글 아이디 내림차순

SELECT BOARD_ID,
       WRITER_ID,
       TITLE,
       PRICE,
       CASE STATUS
           WHEN 'SALE' THEN '판매중'
           WHEN 'RESERVED' THEN '예약중'
           ELSE '거래완료'
           END STATUS
FROM USED_GOODS_BOARD
WHERE CREATED_DATE = '2022-10-05'
ORDER BY 1 DESC