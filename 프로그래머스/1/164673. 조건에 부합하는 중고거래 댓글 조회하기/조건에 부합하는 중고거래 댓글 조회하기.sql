-- 코드를 입력하세요
Select
    b.TITLE,
    b.BOARD_ID,
    r.REPLY_ID,
    r.WRITER_ID,
    r.CONTENTS,
    DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
From
    USED_GOODS_BOARD b
Join
    USED_GOODS_REPLY r
On
    b.BOARD_ID=r.BOARD_ID
Where
    b.CREATED_DATE LIKE '2022-10%'
Order By
    r.CREATED_DATE, b.TITLE;