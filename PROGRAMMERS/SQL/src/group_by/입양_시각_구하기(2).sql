# 0~23시 각 시간대별 입양 건 수 조회
# 시간대 기준 오름차순

SET @hour = -1;
SELECT (@hour := @hour + 1) HOUR,
       (SELECT COUNT(*)
        FROM ANIMAL_OUTS
        WHERE HOUR(DATETIME) = @hour) COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23
ORDER BY HOUR