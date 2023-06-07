use AtencionCliente
go

CREATE FUNCTION Encriptar(@Clave varchar(50))
returns varbinary(8000)
as
begin
	declare @valor varbinary(8000)
	set @valor = ENCRYPTBYPASSPHRASE('Jaime.2000', @Clave)
	return @valor
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
ALTER FUNCTION desencriptar(@Clave varbinary(8000))
returns varchar(50)
as
begin
	declare @valor varbinary(8000)
	set @valor = DECRYPTBYPASSPHRASE('Jaime.2000', @Clave)
	return @valor
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
ALTER FUNCTION validarUser(@Nombre varchar(50), @Clave varchar(50))
returns BIT
as
begin
	DECLARE @VALIDO BIT;
		SELECT @VALIDO = CASE WHEN COUNT(*) > 0 THEN 1 ELSE 0 END FROM tbUsuario WHERE Nombre = @Nombre AND dbo.desencriptar(Clave) = @Clave;
	RETURN @VALIDO;
end
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------


