alter table bt_board
	drop
	foreign key FK_user_id;

drop table if exists mt_user;
drop table if exists bt_board;

create table mt_user (
   id varchar(50) primary key,
   email varchar(30) not null,
   password varchar(60),
   status bit not null,
   created_dt datetime
);
create table bt_board (
   id bigint primary key auto_increment,
   user_id varchar(50) not null,
   title varchar(30) not null,
   contents longtext ,
   hits bigint,
   enabled bit not null,
   created_dt datetime,
   updated_dt datetime
);

alter table bt_board
   add constraint FK_user_id
   foreign key (user_id)
   references mt_user (id);


alter table mt_user
	add constraint UK_9bj43ujpjrey1uohrsdfj3p3t  unique (email);

create index idx_pu_userId on bt_board (user_id);