# 보호 기간이 가장 긴 동물 2 마리
# 보호 기간 기준 내림차순

SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS I
         JOIN ANIMAL_OUTS O
              ON I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY DATEDIFF(O.DATETIME, I.DATETIME) + 1 DESC
LIMIT 2