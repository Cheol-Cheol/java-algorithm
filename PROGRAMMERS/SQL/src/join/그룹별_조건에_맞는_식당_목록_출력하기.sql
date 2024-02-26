# 리뷰를 가장 많이 작성한 회원 리뷰 조회
# 1) 리뷰 카운트 제일 높은 회원 아이디 = 서브쿼리
# 2) 회원 아이디로 정보 조회
# 리뷰 작성일 기준 오름차순 / 리뷰 텍스트 기준 오름차순

SELECT P.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, '%Y-%m-%d') REVIEW_DATE
FROM MEMBER_PROFILE P
         JOIN REST_REVIEW R
              ON P.MEMBER_ID = R.MEMBER_ID
WHERE P.MEMBER_ID = (SELECT MEMBER_ID
                     FROM REST_REVIEW
                     GROUP BY MEMBER_ID
                     ORDER BY COUNT(*) DESC
                     LIMIT 1)
ORDER BY REVIEW_DATE, REVIEW_TEXT