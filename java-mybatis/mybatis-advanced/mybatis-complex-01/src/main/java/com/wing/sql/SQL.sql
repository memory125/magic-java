drop table if exists wing.teacher;
create table if not exists teacher
(
    id   int auto_increment,
    name varchar(30) default null,
    primary key (id)
)engine=InnoDB default charset=utf8;

insert into teacher(id, name) values (1, 'Jack');

drop table if exists wing.student;
create table if not exists student
(
    id   int auto_increment,
    name varchar(30) default null,
    tid int default null,
    primary key (id),
    key fktid (tid),
    constraint fktid foreign key (tid) references teacher (id)
)engine=InnoDB default charset=utf8;

insert into student(id, name, tid) values (1, 'Tom', 1);
insert into student(id, name, tid) values (2, 'Lina', 1);
insert into student(id, name, tid) values (3, 'Terry', 1);
insert into student(id, name, tid) values (4, 'Jimmy', 1);
insert into student(id, name, tid) values (5, 'Jane', 1);
insert into student(id, name, tid) values (6, 'Peter', 1);
insert into student(id, name, tid) values (7, 'David', 1);
insert into student(id, name, tid) values (8, 'Chris', 1);
insert into student(id, name, tid) values (9, 'Eva', 1);

select * from student s, teacher t where s.tid = t.id;

select s.id, s.name, t.name from student s, teacher t where s.tid = t.id;