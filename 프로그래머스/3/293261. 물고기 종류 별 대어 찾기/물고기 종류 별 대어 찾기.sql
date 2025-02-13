-- 코드를 작성해주세요
SELECT I.ID	,N.FISH_NAME	,I.LENGTH AS LENGTH
FROM FISH_INFO I JOIN FISH_NAME_INFO N ON I.FISH_TYPE=N.FISH_TYPE
WHERE I.LENGTH= (SELECT MAX(LENGTH)
                 FROM FISH_INFO
                 WHERE FISH_TYPE=I.FISH_TYPE)
ORDER BY I.ID