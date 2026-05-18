-- 코드를 입력하세요
SELECT COUNT(name) as count
FROM (SELECT DISTINCT NAME
     FROM ANIMAL_INS) AS name;