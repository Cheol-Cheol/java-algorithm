# 2번 이상의 작업이 필요(서브쿼리 or 조인)
# 1. item_id의 희귀도가 RARE인 parent_item_id 찾기
# 2. parent_item_id와 일치하는 item_id 찾기
# 3. item_id에 대한 정보 조회하기
# 아이템 아이디 기준 내림차순

SELECT ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO
WHERE ITEM_ID IN (SELECT ITEM_ID
                  FROM ITEM_TREE
                  WHERE PARENT_ITEM_ID IN (SELECT ITEM_ID
                                           FROM ITEM_INFO
                                           WHERE RARITY = 'RARE'))
ORDER BY 1 DESC