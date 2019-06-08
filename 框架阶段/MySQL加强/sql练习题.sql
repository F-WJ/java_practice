create table student(
sno varchar(20) not null primary key,
sname varchar(20) not null,
ssex varchar(20) not null,
sbirthday datetime,
class varchar(20)
);create table student(
sno varchar(20) not null primary key,
sname varchar(20) not null,
ssex varchar(20) not null,
sbirthday datetime,
class varchar(20)
);

create table teacher
(
tno varchar(20) not null primary key,
tname varchar(20) not null,
tsex varchar(20) not null,
tbirthday datetime,
prof varchar(20),
depart varchar(20) not null
);

create table course
(
cno varchar(20) not null primary key,
cname varchar(20) not null,
tno varchar(20) not null,
foreign key(tno) references teacher(tno)
);

create table score
(
sno varchar(20) not null,
foreign key(sno) references student(sno),
cno varchar(20) not null,
foreign key(cno) references course(cno),
degree decimal
);

#添加学生信息
insert into student values('108','曾华','男','1977-09-01','95033');
insert into student values('105','匡明','男','1975-10-02','95031');
insert into student values('107','王丽','女','1976-01-23','95033');
insert into student values('101','李军','男','1976-02-20','95033');
insert into student values('109','王芳','女','1975-02-10','95031');
insert into student values('103','陆君','男','1974-06-03','95031');
#添加教师表
insert into teacher values('804','李诚','男','1958-12-02','副教授','计算机系');
insert into teacher values('856','张旭','男','1969-03-12','讲师','电子工程系');
insert into teacher values('825','王萍','女','1972-05-05','助教','计算机系');
insert into teacher values('831','刘冰','女','1977-08-14','助教','电子工程系');
#添加课程表
insert into course values('3-105','计算机导论','825');
insert into course values('3-245','操作系统','804');
insert into course values('6-166','数字电路','856');
insert into course values('9-888','高等数学','831');
#添加成绩表
insert into score values('103','3-245','86');
insert into score values('105','3-245','75');
insert into score values('109','3-245','68');
insert into score values('103','3-105','92');
insert into score values('105','3-105','88');
insert into score values('109','3-105','76');
insert into score values('103','3-105','64');
insert into score values('105','3-105','91');
insert into score values('109','3-105','78');
insert into score values('103','6-166','85');
insert into score values('105','6-166','79');
insert into score values('109','6-166','81');


1、查询Student表中的所有记录的Sname、Ssex和Class列。
SELECT sname, ssex, class FROM student;
2、 查询教师所有的单位即不重复的Depart列。
SELECT DISTINCT depart FROM teacher;
3、 查询Student表的所有记录。
SELECT * FROM student;
4、 查询Score表中成绩在60到80之间的所有记录。
SELECT * FROM score WHERE degree BETWEEN 60 AND 80;
5、 查询Score表中成绩为85，86或88的记录。
SELECT * FROM score WHERE degree IN(85, 86, 88);
6、 查询Student表中“95031”班或性别为“女”的同学记录。
SELECT * FROM student WHERE class = '95031' OR ssex = '女';
7、 以Class降序查询Student表的所有记录。
SELECT * FROM student ORDER BY class DESC;
8、 以Cno升序、Degree降序查询Score表的所有记录。
SELECT * FROM score ORDER BY cno ASC, degree DESC;
9、 查询“95031”班的学生人数。
SELECT COUNT(*) FROM student WHERE class = '95031';
10、查询Score表中的最高分的学生学号(sno)和课程号(cno)。（子查询或者排序）
SELECT * FROM score ORDER BY degree DESC;
11、查询每门课的平均成绩。
SELECT cname , AVG(degree) FROM score 
JOIN course On score.cno = course.cno
GROUP BY score.cno;
12、查询Score表中至少有5名学生选修的并以3开头的课程的平均分数。
SELECT AVG(degree) FROM score WHERE cno = 
(SELECT cno FROM
(SELECT cno , COUNT(*) c FROM score WHERE cno LIKE '3%' GROUP BY cno) t
WHERE t.c > 5);
13、查询分数大于70，小于90的Sno列。
SELECT * FROM score WHERE degree > 70 AND degree < 90;
14、查询所有学生的Sname、Cno和Degree列。
SELECT sname, student.sno, degree FROM student JOIN score ON student.sno = score.sno; 
17、查询“95033”班学生的平均分。
SELECT AVG(degree) FROM student 
JOIN score ON student.sno = score.sno 
WHERE class = '95033' 
18、查询选修“3-105”课程的成绩高于“109”号同学成绩的所有同学的记录。
SELECT * FROM score 
WHERE cno = '3-105' 
AND degree > (SELECT degree FROM score WHERE cno = '3-105' AND sno = 109);
20、查询和学号为108、101的同学同年出生的所有学生的Sno、Sname和Sbirthday列。
SELECT * FROM student
WHERE YEAR(sbirthday) 
IN(SELECT YEAR(sbirthday) FROM student WHERE sno IN(108, 101)) ;
21、查询“张旭“教师任课的学生成绩。(teacher， cource， score去重， 得到新的表判断讲师名)
SELECT  * FROM  teacher 
JOIN (SELECT score.cno, score.degree, course.tno FROM score 
JOIN course ON score.cno = course.cno) t ON teacher.tno = t.tno
HAVING teacher.tname = '张旭';
22、查询选修某课程的同学人数多于5人的教师姓名。(teacher和cource组合, 利用score计算的结果做成的表来判断)
SELECT * FROM  teacher 
JOIN course ON teacher.tno = course.tno 
JOIN  (SELECT cno , COUNT(*) as c FROM score GROUP BY cno) t ON course.cno = t.cno
HAVING t.c > 5;
23、查询95033班和95031班全体学生的记录。
SELECT * FROM student WHERE class IN(95033, 95031);
24、查询存在有85分以上成绩的课程Cno。
SELECT score.cno, score.degree, course.cname 
FROM score 
JOIN course ON course.cno = score.cno
HAVING score.degree > 85;
25、查询出“计算机系“教师所教课程的成绩表。(teacher和课程组合)
SELECT * FROM score
JOIN 
(SELECT course.cno , teacher.depart FROM course JOIN teacher ON teacher.tno = course.tno HAVING depart = '计算机系') t
ON score.cno = t.cno;
26、查询“计算 机系”与“电子工程系“不同职称的教师的Tname和Prof。
SELECT prof, depart FROM teacher GROUP BY  depart, prof;
27、查询选修编号为“3-105“课程且成绩至少高于选修编号为“3-245”的同学的Cno、Sno和Degree,并按Degree从高到低次序排序。
SELECT * FROM score 
JOIN 
(SELECT sno, degree as degree2  FROM score WHERE cno = '3-245') t ON t.sno = score.sno
HAVING cno = '3-105' AND degree > degree2 ;
29、查询所有教师和同学的name、sex和birthday。
SELECT sname name , ssex sex, sbirthday birthday FROM student
UNION
SELECT tname name, tsex sex, tbirthday  birthday FROM teacher;
30、查询成绩比该课程平均成绩低的同学的成绩表。
SELECT * FROM score JOIN student ON student.sno = score.sno
JOIN  (SELECT  cno, AVG(degree) cavg FROM score GROUP BY cno) t2
ON t2.cno = score.cno 
HAVING degree < t2.cavg;
31、查询所有任课教师的Tname和Depart。
SELECT tname, depart FROM teacher
WHERE tno
IN(SELECT tno FROM score JOIN course ON score.cno = course.cno GROUP BY tno) 
32、查询所有未讲课的教师的Tname和Depart。
SELECT tname, depart FROM teacher
WHERE  tno NOT
IN(SELECT tno FROM score JOIN course ON score.cno = course.cno GROUP BY tno)
33、查询至少有2名男生的班号。
SELECT * FROM 
(SELECT class , ssex , COUNT(*) c FROM student GROUP BY class, ssex) t 
WHERE ssex = '男' AND c >= 2;
34、查询Student表中不姓“王”的同学记录。
SELECT * FROM student WHERE sname LIKE '王%';
35、查询Student表中每个学生的姓名和年龄。
SELECT sname, 2019 - YEAR(sbirthday) FROM student;
36、查询Student表中最大和最小的Sbirthday日期值。
SELECT MAX(sbirthday) , MIN(sbirthday) FROM student; 
37、以班号和年龄从大到小的顺序查询Student表中的全部记录。
SELECT * FROM student ORDER BY class DESC , YEAR(sbirthday) DESC;
38、查询“男”教师及其所上的课程。
SELECT * FROM teacher JOIN course ON teacher.tno = course.tno
HAVING tsex = '男';
39、查询最高分同学的Sno、Cno和Degree列。
SELECT * FROM student JOIN score ON student.sno = score.sno
HAVING degree = 
(SELECT MAX(degree) FROM student JOIN score ON student.sno = score.sno)
40、查询和“李军”同性别的所有同学的Sname。
SELECT * FROM student WHERE ssex = 
(SELECT ssex FROM student WHERE sname = '李军')
41、查询和“李军”同性别并同班的同学Sname。
SELECT * FROM student JOIN 
(SELECT ssex, class FROM student WHERE sname = '李军') t
HAVING t.ssex = student.ssex AND t.class = t.class;
42、查询所有选修“计算机导论”课程的“男”同学的成绩表。
SELECT * FROM student JOIN 
(SELECT sno, degree, cname FROM score JOIN course ON score.cno = course.cno) t
ON student.sno = t.sno
HAVING student.ssex = '男' AND t.cname = '计算机导论';

