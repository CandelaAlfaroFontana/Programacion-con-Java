ROP TABLE CLIENTE IF EXISTS;

CREATE TABLE CLIENTE(
nombre VARCHAR(150) NOT NULL,
apellido VARCHAR(150) NOT NULL,
dni INT  NOT NULL,
);

ROP TABLE PRODUCTO IF EXISTS;

CREATE TABLE PRODUCTO(
nombre VARCHAR(150) NOT NULL,
descripcion VARCHAR(150) NOT NULL,
precio INT  NOT NULL,
);

ROP TABLE VENTA IF EXISTS;

CREATE TABLE VENTA(
producto VARCHAR(150) NOT NULL,
medio de pago  VARCHAR(150) NOT NULL,
numero de factura  INT  NOT NULL,
);
