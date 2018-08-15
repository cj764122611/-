create database test;

--用户表
create table user
(
  id        int primary key auto_increment,        
  name      varchar(50) not null,          
  password  varchar(50) not null,          
  age int not null            
);