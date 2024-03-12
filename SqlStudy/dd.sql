UPDATE 
    todo_mst
SET
  todo_complete = case when todo_complete = 0 then 1 ELSE 0 end

WHERE 
todo_code = 3;

UPDATE 
    todo_mst
SET
  importance_flag = case when importance_flag = 0 then 1 ELSE 0 end

WHERE 
todo_code = 3;
UPDATE
todo_mst
set
todo_Content = "내용수정",
update_date=NOW()
WHERE 
todo_Code =4;


DELETE
FROM
todo_mst
WHERE
todo_code = 3;
