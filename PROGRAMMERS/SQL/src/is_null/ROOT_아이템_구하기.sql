# ROOT 아이템 조회
# 아이템 아이디 기준 오름차순

SELECT ITEM_ID, ITEM_NAME
FROM ITEM_INFO
WHERE ITEM_ID IN(SELECT ITEM_ID
                 FROM ITEM_TREE
                 WHERE PARENT_ITEM_ID IS NULL)
ORDER BY 1