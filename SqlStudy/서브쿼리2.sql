#student_mst에서 부산대학교 학생의 정보를 조회하시오

SELECT *FROM student_mst WHERE school_code = 1;

#where절에서의 서브쿼리
SELECT 
school_code 
FROM 
school_mst
WHERE
school_name = '부산대학교';


SELECT
 *FROM 
 student_mst 
 WHERE 
 school_code =(SELECT
  school_code 
FROM 
school_mst
WHERE 
school_name = '부산대학교');
#부산대학교의 school_code를 조회하시오

#select절에서의 서브쿼리
SELECT 
student_name,
student_year,
school_code,
(SELECT 
COUNT(*) #총 조회되는 수
FROM 
student_mst
WHERE student_year =1
) AS student_count
FROM 
student_mst
WHERE 
student_year = 1; 
# student_mst 에서 1학년인 사람

#from절
SELECT *FROM(SELECT *from student_mst
WHERE school_code = (SELECT school_code 
                     FROM 
                     school_mst
                     WHERE
                     school_name = '부산대학교')) sm
LEFT OUTER JOIN school_mst scm ON(scm.school_code = sm.school_code);

# 서브쿼리보다 left outer join을 많이 쓰도록 연습

## 서브쿼리없이 부산대학교 학생의 이름, 학년 ,전공명 , 학생수를 조회 하시오

SELECT *FROM major_mst;
SELECT *FROM student_mst;
SELECT *FROM school_mst;


SELECT sm.student_name AS '이름',sm.student_year AS '학년' ,m.major_name AS '전공명',
(SELECT COUNT(*) FROM student_mst WHERE school_code = (SELECT school_code FROM school_mst WHERE school_name = '부산대학교'))AS '학생수'
 FROM student_mst sm 
LEFT OUTER JOIN school_mst scm ON(sm.school_code = scm.school_code)
LEFT OUTER JOIN major_mst m ON(sm.major_code = m.major_code)
WHERE scm.school_name = '부산대학교';




#from
#student_mst sm
#left OUTER JOIN school_mst  scm ON(sm.school_code = scm.school_code)
#LEFT OUTER JOIN major_mst m ON(sm.major_code = m.major_code)
#WHERE sm.student_year IN (1,2)
#ORDER BY m.major_code desc;
