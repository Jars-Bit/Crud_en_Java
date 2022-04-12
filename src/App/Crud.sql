create database Crud;

use Crud;

create table Clientes (
	id int identity(1,1) primary key,
	nombre_Usuario varchar(100),
	nombre varchar(100),
	apellido varchar(100),
	Correo varchar(100),
	Numero_telefono varchar(100),
	pass varchar(100),
	pass_Conf varchar(100)
);
