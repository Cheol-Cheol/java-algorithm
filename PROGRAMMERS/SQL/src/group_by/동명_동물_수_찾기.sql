# 두 번 이상 쓰인 이름과 이름이 쓰인 횟수 조회
# 이름이 없는 동물은 집계에서 제외
# 이름 기준 오름차순

SELECT NAME, COUNT(*) COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(*) >= 2
ORDER BY NAME