/*
create table tbEmpresa (idEmpresa int primary key not null identity(1,1), 
							Nombre varchar(50) not null ); 

create table tbSucursal (idSucursal int primary key not null identity(1,1),
						Nombre varchar(50) not null,
						idEmpresa INT not null CONSTRAINT FK_idEmpresa FOREIGN KEY (idEmpresa) REFERENCES tbEmpresa(idEmpresa));

create table tbAsesor (idAsesor int primary key not null identity(1,1),
						Nombre varchar(50) not null,
						Apellido varchar(50) not null,
						Telefono varchar(50) not null,
						idSucursal INT not null CONSTRAINT FK_idSucursal FOREIGN KEY (idSucursal) REFERENCES tbSucursal(idSucursal)); 

create table tbTransaccion (idTransaccion int primary key not null,
							idAsesor INT not null CONSTRAINT FK_idAsesor FOREIGN KEY (idAsesor) REFERENCES tbAsesor(idAsesor),
							idSucursal INT not null CONSTRAINT FK_idSucursal2 FOREIGN KEY (idSucursal) REFERENCES tbSucursal(idSucursal),
							idEmpresa INT not null CONSTRAINT FK_idEmpresa2 FOREIGN KEY (idEmpresa) REFERENCES tbEmpresa(idEmpresa)); 


create table tbPedido (idPedido int primary key not null,
						Fecha date not null,
						Descripcion varchar(800) not null,
						Estado varchar(50) not null,
						idCliente INT not null CONSTRAINT FK_idCliente FOREIGN KEY (idCliente) REFERENCES tbCliente(idCliente),
						idTransaccion INT not null CONSTRAINT FK_idTransaccion FOREIGN KEY (idTransaccion) REFERENCES tbTransaccion(idTransaccion));

create table tbCliente (idCliente int primary key not null identity(1,1),
						Nombre varchar(50) not null,
						Apellido varchar(50) not null,
						Telefono varchar(50) not null,
						Direccion varchar(50) not null); 

create table tbVehiculo (idVehiculo int primary key not null identity(1,1),
						Marca varchar(50) ,
						Placa varchar(50) ,
						idCliente INT not null CONSTRAINT FK_idCliente2 FOREIGN KEY (idCliente) REFERENCES tbCliente(idCliente)); 

						insert into tbVehiculo values ('Toyota','p0125LKI',15)

create table tbCalendario (idCalendario int primary key not null identity(1,1),
						Ult_Servicio date not null,
						Prox_Servicio date not null,
						idCliente INT not null CONSTRAINT FK_idCliente3 FOREIGN KEY (idCliente) REFERENCES tbCliente(idCliente),
						idVehiculo INT not null CONSTRAINT FK_idVehiculo FOREIGN KEY (idVehiculo) REFERENCES tbVehiculo(idVehiculo)); 
						
create table tbUsuario (idUsuario int primary key not null identity (1,1),
						Nombre varchar(50) not null,
						Clave varbinary(8000) not null,
						Tipo varchar(50) not null);

create table tbConsulta (idConsulta int primary key not null identity(1,1),
						Fecha date not null,
						Resp_Cliente varchar(50) not null,
						Adquirio varchar(50) not null,
						Resp_Final varchar(50) not null,
						Comentario varchar(5000) not null,
						idPedido INT not null CONSTRAINT FK_idPedido FOREIGN KEY (idPedido) REFERENCES tbPedido(idPedido));*/



drop table tbVehiculo
drop table tbCalendario
select * from tbEmpresa
select * from tbSucursal
select * from tbAsesor
select * from tbCliente
--select * from tbTransaccion
--select * from tbPedido
select * from tbVehiculo
select * from tbCalendario
select * from tbUsuario
--
use AtencionCliente
go

select * from tbTransaccion

select * from tbPedido

select * from tbConsulta




DELETE FROM tbTransaccion where idTransaccion between 1 and 80
DELETE FROM tbPedido where idPedido between 1 and 80
DELETE FROM tbConsulta where idConsulta between 1 and 80
DELETE FROM tbVehiculo where idVehiculo between 1 and 80
DELETE FROM tbCalendario where idCalendario between 1 and 80
DELETE FROM tbAsesor where idAsesor between 1 and 80
DELETE FROM tbSucursal where idSucursal between 1 and 80
DELETE FROM tbEmpresa where idEmpresa between 1 and 80
DELETE FROM tbCliente where idCliente between 1 and 80
DELETE FROM tbAsesor where idAsesor between 1 and 80


DELETE FROM tbAsesor where idAsesor between 1 and 80
exec insertPedido '2023-05-25','llantas rhino','No',11,0001
exec insertTransac 1,1,1,1

Select max(idTransaccion) from tbTransaccion

drop table tbCliente