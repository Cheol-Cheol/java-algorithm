# 내부 조인 2022년 10월
# 댓글 작성일 기준 오름차순 / 제목 기준 오름차순

SELECT B.TITLE,	B.BOARD_ID,	R.REPLY_ID,	R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') CREATED_DATE
FROM USED_GOODS_BOARD B
         JOIN USED_GOODS_REPLY R
              ON B.BOARD_ID = R.BOARD_ID
WHERE B.CREATED_DATE BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY 6, 1