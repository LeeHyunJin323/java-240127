INSERT INTO 
user_mst 
VALUES(
0,"hong","1234","홍길동","hong@",now(),NOW());


-- user_id를 통해서 user객체를 가져오는 쿼리문?

SELECT *from user2_mst;

SELECT *FROM user_dtl;

SELECT 
um.user_code,
um.user_name,
um.user_id,
um.user_password,
um.user_roles,
um.user_provider,
ud.user_profile_img,
ud.user_address,
ud.user_phone,
ud.user_gender
FROM 
user2_mst um
LEFT OUTER JOIN user_dtl ud ON(um.user_code = ud.user_code)
WHERE 
um.user_id = 'hong1';
