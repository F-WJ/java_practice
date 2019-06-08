查询所有员工信息
-- 全列/投影查询
SELECT * FROM emp;
查询每个员工的编号、姓名、职位
SELECT empno, ename, job FROM emp;
查询所有部门信息


-- 消除重复
查询所有有员工的部门编号 *
SELECT DISTINCT emp.deptno FROM emp, dept;
查询有员工的部门和职位 *
SELECT DISTINCT deptno, job FROM emp

-- 算术运算符
查询所有员工的年薪 *
SELECT ename, (sal + IFNULL(comm, 0)) * 12 FROM emp; 
查询所有员工的年薪（使用别名）
SELECT ename, (sal + IFNULL(comm, 1)) * 12 AS '年薪' FROM emp;

-- 比较运算符
查询出基本工资高于 1500 的所有员工信息
SELECT * FROM emp WHERE sal > 1500;
查询名字叫 SCOTT 的员工所从事的工作
SELECT * FROM emp WHERE ename = 'scott'; 
查询 1981 年入职的员工信息
SELECT * FROM emp WHERE hiredate BETWEEN '1981-01-01' AND '1981-12-31';
查询年薪小于 3W 的员工
SELECT ename , (sal + IFNULL(comm, 0)) * 12  FROM emp WHERE (sal + IFNULL(comm, 0)) * 12   <= 30000;
查询所有不是销售人员的员工信息
SELECT ename, job FROM emp WHERE job <> 'SALESMAN';

-- 使用 BETWEEN ... AND 运算符
查询工资在 2000-3000 之间的员工信息
SELECT * FROM emp WHERE sal BETWEEN 2000 AND 3000;
查询 1981 年入职的员工
SELECT * FROM emp WHERE hiredate BETWEEN '1981-01-01' AND '1981-12-31';

-- 使用 IN 运算符
查询工资为 800 或 1600 或 3000 的员工
SELECT * FROM emp WHERE sal IN(800, 1600, 3000);

-- 使用 LIKE 运算符
查询出所有雇员姓名是以 A 开头的全部雇员信息。A%
SELECT * FROM emp WHERE ename LIKE 'A%';
查询出雇员姓名第二个字母是 M 的全部雇员信息。_M%
SELECT * FROM emp WHERE ename LIKE '_M%';
查询出雇员姓名任意位置上包含字母 A 的全部雇员信息。%A%
SELECT * FROM emp WHERE ename LIKE '%A%';

-- 使用函数 IFNULL(expr1, expr2)，若 expr1 不是 NULL，IFNULL() 返回 expr1，否则它返回 expr2
查询所有员工的年薪((月薪 + 奖金) * 12) *
SELECT (sal + IFNULL(comm, 0)) * 12 FROM emp;

-- 使用 IS NULL（IS NOT NUll）运算符
查询有奖金的员工信息 *
SELECT * FROM emp WHERE comm IS NOT NULL;
查询公司的老板
SELECT * FROM emp WHERE MGR IS NULL;

-- 逻辑运算符
查询中有 e 或者 a 的员工姓名
SELECT * FROM emp WHERE ename LIKE '%e%' OR ename LIKE '%a%';
查询工资在 1500~3000 之间的全部员工信息
SELECT * FROM emp WHERE sal >= 1500 AND sal <= 3000;
查询工资不在 2000-3000 之间的员工信息
SELECT * FROM emp WHERE NOT sal >= 2000 AND sal <= 3000;
查询工资不为 800 或 1600 或 3000 的员工
SELECT * FROM emp WHERE  NOT sal = 800 OR sal = 1600 OR sal = 3000;
查询出职位是办事员 (CLERK) 或者是销售人员 (SALESMAN) 的全部信息，且工资在 1000 以上
SELECT * FROM emp WHERE  job = 'CLERK' OR job = 'SALESMAN' AND sal > 1000;

-- 结果排序
查询所有员工信息，按照工资排序
SELECT * FROM emp ORDER BY sal ASC;
查询所有员工信息，按照年薪降序排序
SELECT * FROM emp ORDER BY (sal + IFNULL(comm, 0)) * 12 DESC;
查询所有员工信息，按照部门和年薪降序排序 *
SELECT * FROM emp ORDER BY deptno DESC, (sal + IFNULL(comm, 0)) * 12 DESC;

-- 隐式内连接查询
查询员工编号，员工名称，员工所属部门的编号和名称
SELECT emp.EMPNO, emp.ENAME, emp.DEPTNO, dept.DNAME FROM emp, dept WHERE emp.DEPTNO = dept.DEPTNO;
查询员工的姓名，工资，所在部门的名称，以及工资的等级
SELECT ename, sal, emp.deptno, grade, losal, hisal FROM emp, dept, salgrade WHERE emp.DEPTNO = dept.DEPTNO AND sal BETWEEN losal AND hisal;

-- 显示内连接查询
查询出员工的编号，名字，薪水和所在部门的名称（使用内连接查询）：
SELECT emp.EMPNO, emp.ENAME, emp.sal, emp.DEPTNO FROM emp JOIN dept ON emp.DEPTNO = dept.DEPTNO;

-- 左外连接查询
查询出员工的编号，名字，薪水和所在部门的名称（使用左外连接查询）：
SELECT emp.EMPNO, emp.ENAME, emp.sal, emp.DEPTNO FROM emp LEFT JOIN dept ON emp.DEPTNO = dept.DEPTNO;

-- 右外连接查询
查询出员工的编号，名字，薪水和所在部门的名称（使用右外连接查询）：
SELECT emp.EMPNO, emp.ENAME, emp.SAL, emp.DEPTNO FROM emp RIGHT JOIN dept ON emp.DEPTNO = dept.DEPTNO;

-- 全外连接查询(获得两边的查询的结果)
SELECT emp.EMPNO, emp.ENAME, emp.SAL, emp.DEPTNO FROM emp LEFT JOIN dept ON emp.DEPTNO = dept.DEPTNO
UNION
SELECT emp.EMPNO, emp.ENAME, emp.SAL, emp.DEPTNO FROM emp RIGHT JOIN dept ON emp.DEPTNO = dept.DEPTNO;

-- 自连接查询
查询所有员工的领导名字
SELECT e.EMPNO, e.ename, manage.ENAME FROM emp e JOIN emp manage ON e.mgr = manage.empno;

-- 多行函数
查询所有员工每个月的平均工资及总工资
SELECT AVG(sal + IFNULL(comm,0)), SUM(sal + IFNULL(comm, 0)) FROM emp;
查询月薪在 2000 以上的员工总人数
SELECT COUNT(*) FROM emp WHERE sal > 2000;
查询员工最高工资和最低工资差距
SELECT  MAX(sal + IFNULL(comm, 0)), MIN(sal + IFNULL(comm, 0)) FROM emp;

-- 分组查询
按照职位分组，求出每个职位的最高和最低工资
SELECT  job , COUNT(*) FROM emp GROUP BY job;
查询出每一个部门员工的平均奖金
SELECT AVG(IFNULL(comm, 0)) FROM emp GROUP BY emp.DEPTNO;
查询出每一个部门员工的平均工资
SELECT AVG(emp.sal) FROM emp GROUP BY emp.DEPTNO;
查询各个部门和岗位的平均工资
SELECT * FROM emp GROUP BY emp.DEPTNO, emp.JOB;

-- 分组限定(HAVING)
查询部门平均工资高于 2000 的部门及其平均工资
SELECT * FROM emp GROUP BY emp.DEPTNO HAVING emp.SAL > 2000;
查询在 80, 81, 82 年各进公司多少人
SELECT YEAR(HIREDATE) y, COUNT(EMPNO) FROM emp GROUP BY YEAR(HIREDATE) HAVING y BETWEEN '1980' AND '1982'  
查询各个管理人员下员工的平均工资，其中最低工资不能低于 1300，不计算老板
SELECT MGR, AVG(SAL), MIN(SAL) AS minsal FROM emp GROUP BY MGR HAVING MGR IS NOT NULL AND minsal >= 1300

