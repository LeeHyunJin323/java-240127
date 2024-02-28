

INSERT INTO
   major_mst(
   major_code,
   major_name,
   create_date,
   update_date
   )
   values
   (0,
   "컴퓨터공학과",
   NOW(),
   NOW()
   ),(0,
   "전자공학과",
   NOW(),
   NOW()
   ),
   (0,
   "기계공학과",
   NOW(),
   NOW()
   ),
   (0,
   "화학공학과",
   NOW(),
   NOW()
   ),
   (0,
   "동명대학교",
   NOW()
   NOW()
   ),
   (0,
   "토목공학과",
   NOW(),
   NOW()
   ),
   (0,
   "국어국문학과",
   NOW(),
   NOW()
   ),
   (0,
   "영어영문학과",
   NOW(),
   NOW()
   ),
      (0,
   "유아교육학과",
   NOW(),
   NOW()
   ),
      (0,
   "경영학과",
   NOW(),
   NOW()
   ),
   (0,
   "정치외교학과",
   NOW(),
   NOW()
   );
   
   SELECT *FROM major_mst;
   
   #컴퓨터 공학과와 정치외교학과를 조회한후 정치외교학과가 조회된 테이블 제일 상단에 위치
   
   SELECT major_code ,major_name ,create_date,update_date 	
	FROM major_mst 
	WHERE major_name LIKE '%공학%'
	ORDER BY  major_code DESC;
	
	
	INSERT INTO 
	student_mst
	VALUES 
	(0,'홍길동',1,1,1,NOW(),NOW()),
	(0,'홍길동1',2,2,2,NOW(),NOW()),
	(0,'홍길동2',2,3,4,NOW(),NOW()),
	(0,'홍길동3',3,5,7,NOW(),NOW()),
	(0,'홍길동4',4,8,1,NOW(),NOW()),
	(0,'홍길동5',1,4,1,NOW(),NOW()),
	(0,'홍길동6',2,6,5,NOW(),NOW()),
	(0,'홍길동7',5,3,8,NOW(),NOW()),
	(0,'홍길동8',7,5,7,NOW(),NOW()),
	(0,'홍길동9',3,8,1,NOW(),NOW()),
	(0,'홍길동10',1,6,8,NOW(),NOW()),
	(0,'홍길동11',2,8,1,NOW(),NOW()),
	(0,'홍길동12',2,5,9,NOW(),NOW());
	

	
	
	 
	 
	 
	 
	 




