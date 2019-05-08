# UNDAV-POO-TarjetasDeCredito
Resolución de ejercicio "Tarjetas de credito"

## Enunciado
Pertenecemos a la gerencia de Condiciones Comerciales de una empresa emisora de una Tarjeta de Crédito. La gerencia de Ventas nos provee una interfaz Cliente, cuyos contratos son:
- comprar(int monto)
- pagarVencimiento(int monto)

Se pide contemplar los siguientes requerimientos:
- algunos clientes adheridos a una promoción suman 15 puntos por cada compra mayor a $50.
- además, algunos clientes contrataron el sistema 'Safe Shop', que bloquea compras de la tarjeta mayores a un monto que el cliente fija.

## Sobre el dominio
Tenemos dos sectores dentro de la empresa de tarjetas de crédito:
- Ventas
- Condiciones Comerciales

¿Qué responsabilidades cumplen cada una?
Si bien la empresa tiene vendedores que son quienes interactúan en muchos casos con los clientes
(para ofrecer nuevos servicios), en muchas empresas existe un sector que determina restricciones o acuerdos que los vendedores deben cumplir, que son las "condiciones comerciales".

Ejemplos:
- Todos los clientes del exterior tienen un descuento por pronto pago del 20%
- Sólo se puede trabajar con clientes mayoristas
- Los clientes Rabufetti y Conesa aceptan cheques a 30, 60 y 90 días como forma de pago

Vemos que Cliente intersecta el negocio de ambos sectores (Ventas y Condiciones Comerciales).
Ahora veremos cómo atacar estos requerimientos.
