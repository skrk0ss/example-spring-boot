alter table board
drop
foreign key FK_user_id;

drop table if exists user;
drop table if exists board;

create table user (
   id int primary key auto_increment,
   email varchar(30),
   username varchar(30),
   status bit,
   created_dt datetime
);
create table board (
   id int primary key auto_increment,
   user_id int,
   title varchar(30),
   contents varchar(255),
   hits int,
   enabled bit,
   created_dt datetime,
   updated_dt datetime
);

alter table board
    add constraint FK_user_id
    foreign key (user_id)
    references user (id);