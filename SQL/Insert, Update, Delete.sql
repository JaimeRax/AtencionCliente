use AtencionCliente
go
SELECT GETDATE();

------------------------------------------------------------------------------------
------------------------------------- INSERT ---------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertUser 
	@Nombre varchar(50), 
	@Clave varchar(50), 
	@Tipo varchar(50)
as
begin
	begin try
		begin tran
			insert into tbUsuario values (@Nombre, dbo.Encriptar(@Clave),@Tipo)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
select * from tbUsuario
exec insertUser 'arturito','admin','Administrador'
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertEmp 
	@nombre varchar(50)
as
begin
	begin try
		begin tran
			insert into tbEmpresa values (@nombre)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertSuc
	@nombre varchar(50),
	@emp int
as
begin
	begin try
		begin tran
			insert into tbSucursal values (@nombre,@emp)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertAsesor 
	@Nombre varchar(50), 
	@Apelldio varchar(50), 
	@Telefono varchar(50),
	@idSucursal int
as
begin
	begin try
		begin tran
			insert into tbAsesor values (@Nombre, @Apelldio,@Telefono,@idSucursal)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
ALTER PROCEDURE insertTransac
	@id int,
	@asesor int, 
	@sucursal int, 
	@empresa int
as
begin
	begin try
		begin tran
			insert into tbTransaccion values (@id,@asesor,@sucursal,@empresa)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertCliente
	@nombre varchar(50), 
	@apellido varchar(50),
	@telefono varchar(50),
	@direccion varchar(50)
as
begin
	begin try
		begin tran
			insert into tbCliente values (@nombre,@apellido,@telefono,@direccion)
		commit tran
	end try
	begin catch
		rollback
	end catch
end

------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
ALTER PROCEDURE insertPedido
	@id int,
	@fecha date, 
	@descripcion varchar(800),
	@estado varchar(50),
	@idCli int,
	@idTran int
as
begin
	begin try
		begin tran
			insert into tbPedido values (@id,@fecha,@descripcion,@estado,@idCli,@idTran)
		commit tran
	end try
	begin catch
		rollback
	end catch
end

------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertConsulta
	@fecha date,
	@atencion varchar(50),	
	@adquirio varchar(50),
	@resp varchar(50),
	@comentario varchar(5000),
	@idPedido int
as
begin
	begin try
		begin tran
			insert into tbConsulta values (@fecha,@atencion,@adquirio,@resp,@comentario,@idPedido)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertVehiculo
	@marca varchar(50),
	@placa varchar(50),
	@idCliente int
as
begin
	begin try
		begin tran
			insert into tbVehiculo values (@marca,@placa,@idCliente)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE insertSericio
	@ult date,
	@prox date,
	@idCli int,
	@idVehi int
as
begin
	begin try
		begin tran
			insert into tbCalendario values (@ult,@prox,@idCli,@idVehi)
		commit tran
	end try
	begin catch
		rollback
	end catch
end
select * from tbCalendario
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
------------------------------------- UPDATE ---------------------------------------
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE updateEmp
	@id int,
	@Nombre varchar(50)
as
begin
	begin try
		begin tran
			update tbEmpresa set Nombre=@Nombre where idEmpresa = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
ALTER PROCEDURE updateCliente
	@id int,
	@nombre varchar(50), 
	@apellido varchar(50),
	@telefono varchar(50),
	@direccion varchar(50)
as
begin
	begin try
		begin tran
			update tbCliente set Nombre=@Nombre, Apellido=@apellido, Telefono=@telefono, Direccion=@direccion where idCliente = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE updateConsulta
	@id int,
	@atencion varchar(50),
	@adquirio varchar(50),
	@res varchar(50),
	@comentario varchar(500)
as
begin
	begin try
		begin tran
			update tbConsulta set Resp_Cliente=@atencion, Adquirio=@adquirio, Resp_Final=@res, Comentario=@comentario where idConsulta = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end

------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE updateSuc
	@id int,
	@Nombre varchar(50),
	@emp int
as
begin
	begin try
		begin tran
			update tbSucursal set Nombre=@Nombre, idEmpresa=@emp where idSucursal = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE updateAsesor
	@id int,
	@Nombre varchar(50), 
	@Apelldio varchar(50), 
	@Telefono varchar(50)
as
begin
	begin try
		begin tran
			update tbAsesor set Nombre=@Nombre, Apellido=@Apelldio,Telefono=@Telefono where idAsesor = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end

------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE updateUser 
	@id int,
	@Nombre varchar(50), 
	@Clave varchar(50), 
	@Tipo varchar(50)
as
begin
	begin try
		begin tran
			update tbUsuario set Nombre=@Nombre, Clave=dbo.Encriptar(@Clave),Tipo=@Tipo where idUsuario = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE updatePedido
	@id int,
	@estado varchar(50)
as
begin
	begin try
		begin tran
			update tbPedido set Estado=@estado where idPedido = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
------------------------------------- DELETE ---------------------------------------
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE deleteEmp 
	@id int
as
begin
	begin try
		begin tran
			delete from tbEmpresa  where idEmpresa = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE deleteVehiculo
	@id int
as
begin
	begin try
		begin tran
			delete from tbVehiculo  where idVehiculo = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE deleteSuc 
	@id int
as
begin
	begin try
		begin tran
			delete from tbSucursal  where idSucursal = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE deleteAse 
	@id int
as
begin
	begin try
		begin tran
			delete from tbAsesor  where idAsesor = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
CREATE PROCEDURE deleteCliente
	@id int
as
begin
	begin try
		begin tran
			delete from tbCliente  where idCliente = @id
		commit tran
	end try
	begin catch
		rollback
	end catch
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------






