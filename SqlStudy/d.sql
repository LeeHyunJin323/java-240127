INSERT INTO 
    practice_board
VALUES(
0,
"practice board title 9",
"practice board content 9",
1,
NOW(),
NOW());

INSERT INTO
  practice_user
VALUES(practice_user
0,
"hong",
"1234",
NOW(),
NOW());


SELECT 
pb.board_id,
pb.board_title,
pb.board_content,
pb.user_id,
pu.user_username,
pb.create_date,
pb.update_datepractice_boardtodo_mst
from
 practice_board pb
 LEFT OUTER JOIN practice_user pu ON(pb.user_id = pu.user_id)
 ORDER by 
 pb.create_date DESC 
 LIMIT 0,10;
 
 
 