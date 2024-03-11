-- importance_flag가 1인 것들의 개수를 구하기

 SELECT COUNT(*)
 FROM
 todo_mst 
 WHERE importance_flag = 1
 
 
-- todo_code 에 3을 던져주면 
-- 만약에 3의 complete가 0이면 1로 바꾸고
-- 1 이면 0으로 바꿔라


SELECT todo_mst;	
case WHEN todo_complete = 0 THEN 1
    WHEN todo_complete = 1 THEN 0
    ELSE 0
    END AS B
WHERE todo_code = 3;


