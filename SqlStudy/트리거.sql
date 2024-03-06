INSERT into user2_mst VALUES
(0,'홍길동5',
'hong5@gmail.com',
'hong5',
'1234',
'ROLE_USER',
'google',
NOW(),
NOW()
);


#user_dtl에 null허용값은 안 적어줌
# user_code에 오토인크리먼트 안달았음
# 짝을 맞출려고 ㅇㅇ
INSERT INTO user_dtl (
user_code, 
create_date,
update_date  
)
VALUES(
0,NOW(),NOW());



   
SELECT *FROM board_mst;
SELECT *FROM user2_mst;
SELECT *from user_dtl;


SELECT bm.boardcode,
bm.title, 
um.user_code, 
um.username, 
bm.content,
um.create_date,
um.update_date
FROM user2_mst um
LEFT OUTER JOIN board_mst bm ON(um.user_code = bm.usercode);content_mstcontent_mst