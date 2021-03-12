drop table if exists wing.user;
create table if not exists user
(
    id   int auto_increment,
    name varchar(30) default null,
    pwd  varchar(30) default null,
    primary key (id)
)engine=InnoDB default charset=utf8;

insert into wing.user(id,name,pwd) values(1,'Jack','123321');


insert into wing.user(id,name,pwd) values(1,'Jack','123321'),
                         (2,'David','123456'),
                         (3,'Owen','111111'),
                         (4,'Mark','123123'),
                         (5,'Tony','112233'),
                         (6,'Kevin','332211'),
                         (7,'Jim','334455');

select * from user;