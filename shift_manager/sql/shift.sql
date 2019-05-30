set names utf8;
set foreign_key_checks = 0;
drop database if exists shift;

create database if not exists shift;
use shift;

drop table if exists user_info;

create table user_info (
user_name varchar(16) unique,
part_id int unique,
ability_flg int not null primary key auto_increment,
admin_flg int default 0
);

INSERT INTO user_info (user_name, part_id, ability_flg, admin_flg)
VALUES ("松山", 1000, 1, 1), ("田中", 1001, 2, 1), ("山田", 1002, 3, 0);

drop table if exists hope_shift;

create table hope_shift (
id int not null primary key auto_increment,
part_id int,
day date,
start_hour time,
finish_hour time,
color varchar(16),

foreign key (part_id) references user_info(part_id)
);

INSERT INTO hope_shift (part_id, day, start_hour, finish_hour, color)
VALUES
('1000', '2019-05-20', '12:00:00', '20:00:00', 'red'),
('1000', '2019-05-21', '12:00:00', '20:00:00', 'red'),
('1002', '2019-05-20', '13:00:00', '20:00:00', 'yellow');

drop table if exists decide_shift;

create table decide_shift (
id int not null primary key auto_increment,
part_id int unique,
day date,
start_hour time,
finish_hour time,
color varchar(16),

foreign key (part_id) references user_info(part_id)
);