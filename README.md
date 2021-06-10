# Agencia de Coches

![alt text](https://github.com/JoseAP89/AgenciaCoches/blob/joseap/src/Resources/logo.png "Logo Empresa")

**Descripción**

Es una aplicación sencilla de una agencia de vehículos, donde seleccionas uno y se te presenta la opción de agregarle componentes/accesorios para mejorar su funcionalidad, con un costo extra, por su puesto.

Contiene 3 pestañas:

* Para elegir el vehículo base
* Añadir los componentes que "decoraran" al vehículo
* Compra del vehículo y generación de la factura de compra 

**Patrones utilizados**

Esta es una aplicación que utiliza como base el patrón decorador para añadir componentes adicionales a un producto base, en este caso el vehículo. También se usa el patrón MVC de forma parcial, dado que las partes VC están juntadas, por la forma en el que netbeans proporciona el GUI generador de código (aka java swing).

