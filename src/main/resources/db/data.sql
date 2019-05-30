DELETE FROM user;

INSERT INTO user (id, name, age, email, is_deleted) VALUES
(1, 'test1', 16, 'test1@163.com', 1),
(2, 'test2', 16, 'test2@163.com', 1),
(3, 'test3', 16, 'test3@163.com', 0),
(4, 'test4', 20, 'test4@163.com', 0),
(5, 'test5', 20, 'test5@163.com', 0),
(6, 'test6', 20, 'test6@163.com', 0),
(7, 'test7', 24, 'test7@163.com', 0),
(8, 'test8', 24, 'test8@163.com', 0),
(9, 'test9', 24, 'test9@163.com', 0),
(10, 'test10', 24, 'test10@163.com', 0);