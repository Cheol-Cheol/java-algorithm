# 입양을 간 기록은 있고, 보호소에 들어온 기록은 없는 -> 외부 조인(OUTS 기준 테이블)
# 아이디 기준 오름차순

SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O
         LEFT JOIN ANIMAL_INS I
                   ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY 1