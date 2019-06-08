1.创建student和score表
CREATE TABLE student (
id INT(10) NOT NULL UNIQUE PRIMARY KEY,
name VARCHAR(20) NOT NULL,
sex VARCHAR(4) ,
birth YEAR,
department VARCHAR(20),
address VARCHAR(50)
);
创建score表。SQL代码如下：
CREATE TABLE score (
id INT(10) NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
stu_id INT(10) NOT NULL ,
c_name VARCHAR(20) ,
grade INT(10)
);
2.为student表和score表增加记录
向student表插入记录的INSERT语句如下：
INSERT INTO student VALUES( 901,'张老大', '男',1995,'计算机系', '北京市海淀区');
INSERT INTO student VALUES( 902,'张老二', '男',1996,'中文系', '北京市昌平区');
INSERT INTO student VALUES( 903,'张三', '女',2000,'中文系', '湖南省永州市');
INSERT INTO student VALUES( 904,'李四', '男',2000,'英语系', '辽宁省阜新市');
INSERT INTO student VALUES( 905,'王五', '女',2001,'英语系', '福建省厦门市');
INSERT INTO student VALUES( 906,'王六', '男',1998,'计算机系', '湖南省衡阳市');向score表插入记录的INSERT语句如下：
INSERT INTO score VALUES(NULL,901, '计算机',98);
INSERT INTO score VALUES(NULL,901, '英语',80);
INSERT INTO score VALUES(NULL,902, '计算机',65);
INSERT INTO score VALUES(NULL,902, '中文',88);
INSERT INTO score VALUES(NULL,903, '中文',95);
INSERT INTO score VALUES(NULL,904, '计算机',70);
INSERT INTO score VALUES(NULL,904, '英语',92);
INSERT INTO score VALUES(NULL,905, '英语',94);
INSERT INTO score VALUES(NULL,906, '计算机',90);
INSERT INTO score VALUES(NULL,906, '英语',85); 


3.查询student表的所有记录
SELECT * FROM student;
4.查询student表的第2条到4条记录 
SELECT * FROM student JOIN
(SELECT id FROM student WHERE id like '__2' OR id like '__4') t
ON student.id = t.id;
5.从student表查询所有学生的学号（id）、姓名（name）和院系（department）的信息
SELECT student.id, name, department FROM student JOIN score ON student.id = score.stu_id;
6.从student表中查询计算机系和英语系的学生的信息
SELECT * FROM student WHERE department IN('计算机系', '英语系'); 
7.从student表中查询年龄18~22岁的学生信息
SELECT * FROM student WHERE (2019 - birth) BETWEEN 18 AND 22;
8.从student表中查询每个院系有多少人 
SELECT department , COUNT(*) FROM student GROUP BY department;
10.查询李四的考试科目（c_name）和考试成绩（grade）
SELECT * FROM student JOIN score ON student.id = score.stu_id
HAVING name = '李四';
11.用连接的方式查询所有学生的信息和考试信息
SELECT * FROM student
12.计算每个学生的总成绩
SELECT * FROM student JOIN
(SELECT stu_id, AVG(grade) FROM score GROUP BY stu_id) t
ON student.id = t.stu_id;
13.计算每个考试科目的平均成绩
SELECT c_name, AVG(grade) FROM score GROUP BY c_name;
14.查询计算机成绩低于95的学生信息
SELECT * FROM student JOIN
(SELECT stu_id, c_name, grade FROM score WHERE c_name = '计算机' AND grade < 95) t
ON student.id = t.stu_id;
15.查询同时参加计算机和英语考试的学生的信息
SELECT DISTINCT name FROM student JOIN
(SELECT stu_id, c_name FROM score WHERE c_name IN('计算机', '英语')) t
ON student.id = t.stu_id;
16.将计算机考试成绩按从高到低进行排序
SELECT * FROM score WHERE c_name = '计算机' ORDER BY grade DESC;
17.从student表和score表中查询出学生的学号，然后合并查询结果
SELECT id FROM student
UNION
SELECT stu_id  FROM score;
18.查询姓张或者姓王的同学的姓名、院系和考试科目及成绩
SELECT * FROM student JOIN score ON student.id = score.stu_id
HAVING name LIKE '王%' OR name LIKE '张%' ;
19.查询都是湖南的学生的姓名、年龄、院系和考试科目及成绩
SELECT * FROM student JOIN score ON student.id = score.stu_id
HAVING address LIKE '湖南%';