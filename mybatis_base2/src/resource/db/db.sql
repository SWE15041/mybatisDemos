CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `account` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table t_student(
 id int primary key auto_increment,
 student_name varchar(20)
);

create table t_courses(
id  int primary key auto_increment,
courses_name varchar(20)
);

create table t_stu_cou(
 id int primary key auto_increment,
 fk_stu_id int,
 fk_cou_id int
);
