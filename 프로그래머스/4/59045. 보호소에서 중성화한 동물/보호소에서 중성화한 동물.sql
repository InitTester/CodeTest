-- 코드를 입력하세요
SELECT A.ANIMAL_ID,
       A.ANIMAL_TYPE,
       A.NAME
FROM ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.SEX_UPON_INTAKE != B.SEX_UPON_OUTCOME
# WHERE NOT EXISTS (SELECT SEX_UPON_OUTCOME FROM ANIMAL_OUTS WHERE SEX_UPON_OUTCOME != A.SEX_UPON_INTAKE)
