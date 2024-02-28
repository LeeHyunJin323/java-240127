SELECT *FROM student_mst;

UPDATE student_mst
SET student_year = 3
WHERE student_code = 4;


#major_code가 7인 로우의 major_name을 중어중문학과로 바꾸시오

SELECT *FROM major_mst;

UPDATE major_mst
SET major_name = '중어중문학과'
WHERE major_code = 7;


#쿼리문을 실행하면 팔로워가 1씩 증가되는 쿼리문을 작성하시오

UPDATE userEx 
SET follower = follower + 1 
WHERE user_code = 1;	

#팔로우가 되어있다면 true 아니면 false 해놓고 true가 될때 팔로우 +1 


SELECT *FROM userEx;

INSERT INTO userEx values(1,'홍길동',NOW(),NOW(),1);
#회원가입 할 때 최초로 받는 유저 정보
/*
이메일 
핸드폰 
비밀번호 이걸 기본으로 만들고


밑에 얘들을 null로 다 만들필요없이 마이페이지에서 추가되는걸로
만드는게 낫지않나?
주소
미혼/기혼
성명
닉네임
생년월일
성별

이현진이라는 사람이 회원가입을 했음 유저코드가 2만10번임
아이유의 페이지를 열면 아이유도 유저코드가 있음 2만번이라는
그래서 상대방을 찾을땐 프라이머리 키인 유저코드를 사용하는듯
*/
#마이페이지가서 추가로 받는 유저정보

#DELETE

DELETE
FROM
student_mst
WHERE student_code = 10;

SELECT *FROM student_mst;