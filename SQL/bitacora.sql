use CC82_AtencionCliente
go


-- Crear tabla de bitácora
CREATE TABLE Bitacora (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    FechaHora DATETIME DEFAULT GETDATE(),
    Usuario VARCHAR(50),
    Accion VARCHAR(100),
	Tabla VARCHAR(100),
    ValorViejo VARCHAR(100),
    ValorNuevo VARCHAR(100)
);

-- Crear disparador

CREATE TRIGGER Tr_BitEmp_insert
ON tbEmpresa
AFTER INSERT
AS
BEGIN
    DECLARE @Usuario VARCHAR(100);
    SET @Usuario = SUSER_SNAME();

    INSERT INTO Bitacora (Usuario, Accion,Tabla, ValorNuevo)
    SELECT @Usuario, 'INSERT','tbEmpresa', idEmpresa
    FROM inserted;
END;



CREATE TRIGGER Tr_BitSuc_insert
ON tbSucursal
AFTER INSERT
AS
BEGIN
    DECLARE @Usuario VARCHAR(100);
	SET @Usuario = dbo.ObtenerUsuario(1);

    INSERT INTO Bitacora (Usuario, Accion,Tabla, ValorNuevo)
    SELECT @Usuario, 'INSERT','tbSucursal', idSucursal
    FROM inserted;
END;


ALTER FUNCTION ObtenerUsuario(@id INT)
RETURNS TABLE
AS
RETURN
    SELECT Nombre FROM tbUsuario WHERE idUsuario = @id;


	SELECT * FROM dbo.ObtenerUsuario(8);

	SELECT * FROM tbUsuario
