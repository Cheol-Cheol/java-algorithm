# 조인 / 조회수가 가장 높은 게시물 1개의 파일 경로 조회
# 파일 이름 - 파일ID/파일이름/파일확장자 = CONCAT
# 파일 아이디 기준 내림차순

SELECT CONCAT('/home/grep/src', '/', BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) FILE_PATH
FROM USED_GOODS_FILE
WHERE BOARD_ID = (SELECT BOARD_ID
                  FROM USED_GOODS_BOARD
                  ORDER BY VIEWS DESC
                  LIMIT 1)
ORDER BY FILE_ID DESC

# 조회수 최댓값을 다음과 같이 서브쿼리로 뽑아서 할 수도 있다.
# SELECT MAX(VIEWS)
# FROM USED_GOODS_BOARD