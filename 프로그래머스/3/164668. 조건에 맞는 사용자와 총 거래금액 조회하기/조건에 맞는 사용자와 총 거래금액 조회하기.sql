-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, SUM(PRICE) AS TOTAL_SALES FROM USED_GOODS_BOARD 
JOIN USED_GOODS_USER ON WRITER_ID = USER_ID
WHERE STATUS = 'DONE'
GROUP BY USER_ID
HAVING SUM(PRICE) >= 700000
ORDER BY 3 ASC
