drop table if exists wing.blog;
create table if not exists blog
(
    id   varchar(50) not null comment '博客id',
    title varchar(100) not null comment '博客标题',
    author varchar(30) not null comment '博客作者',
    create_time datetime not null comment '创建时间',
    views int not null comment '浏览量'
)engine=InnoDB default charset=utf8;