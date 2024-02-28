SELECT 
sm.student_code ,
 sm.student_name AS '이름',
 sm.student_year AS '학년',
 scm.school_code AS '학교코드',
 scm.school_name AS '학교명',
 sm.major_code ,
 m.major_name AS '전공명'
from
student_mst sm
left OUTER JOIN school_mst  scm ON(sm.school_code = scm.school_code)
LEFT OUTER JOIN major_mst m ON(sm.major_code = m.major_code)
WHERE sm.student_year IN (1,2)
ORDER BY m.major_code desc;

# student_mst as sm 을 해두면 sm. 햇을떄 sm의 school_code를 찾을 수 있음 
#left outer join 시트를 연결
SELECT *FROM  major_mst;

