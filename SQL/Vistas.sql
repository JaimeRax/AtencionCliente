use AtencionCliente
go


/*CREATE VIEW vista_sucursales AS 
SELECT tbSucursal.idSucursal, tbSucursal.Nombre AS SUCURSAL, tbEmpresa.Nombre AS EMPRESA from tbSucursal inner join tbEmpresa on tbEmpresa.idEmpresa = tbSucursal.idEmpresa


CREATE VIEW vista_asesor AS
SELECT tbAsesor.idAsesor, tbAsesor.Nombre, tbAsesor.Apellido, tbAsesor.Telefono, tbSucursal.Nombre  AS Sucursal, tbEmpresa.Nombre AS Empresa from tbAsesor 
INNER JOIN tbSucursal ON tbAsesor.idSucursal = tbSucursal.idSucursal
INNER JOIN tbEmpresa ON	tbEmpresa.idEmpresa = tbSucursal.idEmpresa


CREATE VIEW vista_pedidos AS
SELECT p.idPedido,p.Fecha,c.Nombre,c.Apellido,c.Telefono,p.Descripcion,a.Nombre AS Nom_Asesor,a.Apellido AS Apell_Asesor,a.Telefono AS Tel_Asesor, p.Estado from tbPedido p 
INNER JOIN tbCliente c ON c.idCliente = p.idCliente
INNER JOIN tbTransaccion t ON t.idTransaccion = p.idTransaccion
INNER JOIN tbAsesor a ON a.idAsesor = t.idAsesor


CREATE VIEW vista_final AS
SELECT c.idConsulta AS Id, c.Fecha,
		cl.Nombre, cl.Apellido, cl.Telefono,
		p.idPedido AS Id_Pedido, p.Descripcion AS Pedido,
		a.Nombre AS Asesor, a.Apellido AS Apell_Asesor, a.Telefono AS Tel_Asesor,
		c.Resp_Cliente AS FueAtendido, c.Adquirio,c.Resp_Final AS Respuesta_Final,c.Comentario 
		FROM tbConsulta c 
INNER JOIN tbPedido p ON p.idPedido = c.idConsulta
INNER JOIN tbCliente cl ON cl.idCliente = p.idCliente
INNER JOIN tbTransaccion t ON t.idTransaccion = p.idTransaccion
INNER JOIN tbAsesor a ON a.idAsesor = t.idAsesor


ALTER VIEW vista_vehiculo AS
SELECT tbCliente.idCliente,tbCliente.Nombre,tbCliente.Apellido,tbCliente.Telefono,tbCliente.Direccion,tbVehiculo.Marca,tbVehiculo.Placa FROM tbCliente 
LEFT JOIN tbVehiculo ON tbVehiculo.idCliente = tbCliente.idCliente


CREATE VIEW vista_final AS
SELECT tbConsulta.idConsulta AS Id, tbConsulta.Fecha,
		tbCliente.Nombre, tbCliente.Apellido, tbCliente.Telefono,
		tbPedido.idPedido AS Id_Pedido, tbPedido.Descripcion AS Pedido,
		tbAsesor.Nombre AS Asesor, tbAsesor.Apellido AS Apell_Asesor, tbAsesor.Telefono AS Tel_Asesor,
		tbConsulta.Resp_Cliente AS FueAtendido, tbConsulta.Adquirio,tbConsulta.Resp_Final AS Respuesta_Final,tbConsulta.Comentario 
		FROM tbConsulta  
		INNER JOIN tbPedido  ON tbPedido.idPedido = tbConsulta.idPedido
		INNER JOIN tbCliente  ON tbCliente.idCliente = tbPedido.idCliente
		INNER JOIN tbTransaccion ON tbTransaccion.idTransaccion = tbPedido.idTransaccion
		INNER JOIN tbAsesor ON tbAsesor.idAsesor = tbTransaccion.idAsesor


CREATE VIEW servicioss AS
		SELECT tbCliente.idCliente AS ID, tbCliente.Nombre, tbVehiculo.Marca,tbVehiculo.Placa,tbCalendario.Ult_Servicio,tbCalendario.Prox_Servicio 
		FROM tbCliente 
		INNER JOIN tbVehiculo ON tbVehiculo.idCliente = tbCliente.idCliente
		INNER JOIN tbCalendario ON tbCalendario.idVehiculo = tbVehiculo.idVehiculo
*/
select * from servicioss
select * from vista_vehiculo
select * from tbVehiculo
select * from tbConsulta
select * from tbPedido
select * from tbCliente
select * from tbTransaccion
select * from tbAsesor
select * from tbCalendario	
select * from vista_final
