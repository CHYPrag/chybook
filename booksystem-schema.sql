-- ---------------------------------------------------------
-- CHYBooK SQL SCRIPTS
-- author CHY
-- ---------------------------------------------------------

-- ---------------------------------------------------------
-- define some tables the project CHYBooK using
-- Create previously database bookstore if not exists;
-- use bookstore;
-- use bookstore;
-- ---------------------------------------------------------
SET NAMES utf8mb4;

-- ----------------------------------------------------------
-- 管理员
-- ----------------------------------------------------------
create table if not exists Admin (
id int primary key,
`password` varchar(20) not null
);

create table if not exists User(
uid varchar(255) primary key comment '用户名作为唯一标识',
`password` varchar(255) not null comment '通常是单向加密后的',
name varchar(20) default '' comment '昵称',
sex char(2) check(sex = '男' or sex = '女'),
age int check(age > 0),
phone varchar(11),
address varchar(50),
is_lock tinyint default 0 comment '标识用户是否被锁定：0(locked),1(unlocked)',
is_vip tinyint default 1 comment '标识用户的VIP级别：0(无)1(vip)',
vip_expire_datetime datetime comment 'VIP到期时间',
img varchar(255) comment '头像路径',
read_time int check(read_time >= 0) comment '阅读时长',
read_book_sum int check(read_book_sum >= 0) comment '阅读书籍总数',
read_book_complete int check(read_book_complete >= 0) comment '读完书籍数',
interst_field tinyint comment '兴趣领域',
concern_sum int comment '关注数',
likes_sum int comment '点赞数',
create_datetime datetime default current_timestamp comment '注册时间'
);

-- ------------------------------------------------------------------
-- 图书
-- --------------------------------------------------------------
create table if not exists Book(
bid varchar(255),
name varchar(25) not null,
authors varchar(255) comment '以逗号分隔',
isbn varchar(100),
first_category varchar(30) comment '一级分类',
second_category varchar(30) comment '二级分类',
publisher varchar(100) comment '出版社',
producer varchar(100) comment '出品方',
publish_year int,
page_sum int comment '页数',
price decimal(4,2) default 0.00,
cover_img varchar(255) comment '用逗号分隔的图书封面图片路径',
`state` tinyint default 1 comment '标识图书状态：1(免费),2(限免),3(VIP可读)',
readable_day int comment '限免图书可读时间/天',
is_on_sh tinyint default 0 comment '标识图书是否上架：0(否)1(是)',
`abst` text comment '内容简介',
score decimal(1,1) check(score > 0 and score < 10) default 0 comment '图书评分(1--10)',
create_datetime datetime default current_timestamp ,
update_date datetime default current_timestamp on update current_timestamp,
primary key (bid) using btree
);

-- ---------------------------------------------------------------------
-- 书架
-- ---------------------------------------------------------------------
create table if not exists Shelf(
uid varchar(255),
bid varchar(255),
primary key (uid,bid)
);

-- -----------------------------------------------------------------------
-- 书单
-- -----------------------------------------------------------------------
create table if not exists BookList(
    uid varchar(255),
    lid varchar(255) comment '书单id',
    bid varchar(255),
    is_private tinyint default 1 comment '0公开',
    primary key (uid,lid,bid)
);

-- ------------------------------------------------------------------
-- 书籍评论
-- -------------------------------------------------------------------
create table if not exists `Comments`(
    bid varchar(255),
    uid varchar(255),
    `label` tinyint default '2' comment '1(很好)2(一般)3(不行)',
    `contents` text comment '评论的内容',
    comment_time datetime,
    primary key (bid,uid)
);

-- --------------------------------------------------------
-- 笔记
-- --------------------------------------------------------
create table if not exists Notes(
    bid varchar(255),
    uid varchar(255),
    page int comment '在那一页做的笔记',
    is_private tinyint default 1 comment '这条笔记是否私有：0(否)1(是)',
    contents text,
    primary key (bid,uid,page)
);

-- ----------------------------------------------------------------
-- 图书章
-- ----------------------------------------------------------------
CREATE TABLE `chapters` (
  `bid` varchar(255) NOT NULL,
  `chid` varchar(255) NOT NULL,
  `chapter` int DEFAULT '1' COMMENT '章序数',
  `title` varchar(30) DEFAULT NULL COMMENT '章标题',
  `chapter_text` varchar(255) DEFAULT NULL COMMENT '本章文本资源路径',
  PRIMARY KEY (`chid`),
  UNIQUE KEY `bid` (`bid`)
);

-- --------------------------------------------------------------
-- 图书节
-- --------------------------------------------------------------
create table Sections(
secid varchar(255) primary key,
chid varchar(255) unique not null,
section int default 0 comment '节序号',
title varchar(30) comment '节标题',
pointer bigint comment '文本流中节开头偏移量'
);

-- ---------------------------------------------------------------
-- 图书子节
-- ---------------------------------------------------------------
create table subsections(
ssecid varchar(255) primary key,
secid varchar(255) unique not null,
subsection int default 0 comment '子节序号',
title varchar(30) comment '子节标题',
pointer bigint comment '文本流中子节开头偏移量'
);

-- ------------------------------------------------------------------
-- 每章中文本流处应嵌入的图片
-- ------------------------------------------------------------------
create table img_per_chapter(
imgid varchar(255) primary key,
chid varchar(255) unique not null,
`path` varchar(255) comment '图片路径',
pointer bigint comment '每章文本流中图片嵌入处的偏移量'
);