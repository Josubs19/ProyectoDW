# ProyectoDW

Aplique este Script en SQL

create schema proyecto;
create user 'usuario'@'%' identified by 'la_Clave';
grant all privileges on proyecto.* to 'usuario'@'%';
flush privileges;

create table proyecto.carro(
id_carro int Auto_Increment not null,
nombre varchar(30),
categoria varchar(20),
precio int,

primary key(id_carro))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;


create table proyecto.direccion(
id_direccion int auto_increment not null,
provincia varchar(30),
canton varchar(30),
calle1 varchar(30),
calle2 varchar(30),
primary key(id_direccion))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;
