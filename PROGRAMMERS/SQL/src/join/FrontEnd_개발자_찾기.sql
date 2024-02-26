# 프론트엔드 개발자 조회 - 비트 연산자
# 작은 수의 이진수는 큰 수의 이진수에 포함된다.
# 아이디 기준 오름차순

SELECT DISTINCT(D.ID), D.EMAIL, D.FIRST_NAME, D.LAST_NAME
FROM DEVELOPERS D
         JOIN SKILLCODES S
              ON D.SKILL_CODE & S.CODE
                  AND S.CATEGORY = 'Front End'
ORDER BY D.ID