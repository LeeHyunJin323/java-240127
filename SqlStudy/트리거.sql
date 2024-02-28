INSERT into user2_mst VALUES
(0,'홍길동',
'hong@gmail.com',
'hong',
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


DELETE
FROM 
   user2_mst
WHERE
   user_code =1;