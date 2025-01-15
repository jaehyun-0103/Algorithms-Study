-- 코드를 작성해주세요
Select ID, EMAIL, FIRST_NAME, LAST_NAME
From DEVELOPERS
Where SKILL_CODE & (Select Sum(CODE) From SKILLCODES Where NAME IN ('Python','C#'))
Order By ID ASC