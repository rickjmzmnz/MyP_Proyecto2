PRAGMA foreign_keys = ON;

CREATE TABLE distribuidor(
id_distribuidor integer,
nombre_distriuidor varchar(30),
deuda double,
PRIMARY KEY(id_distribuidor)
);

CREATE TABLE marca(
id_marca integer,
nombre_marca varchar(30),
PRIMARY KEY(id_marca)
);

CREATE TABLE juguete(
codigo_de_barras integer,
nombre_juguete varchar(50),
precio double,
clasificacion integer,
PRIMARY KEY(codigo_de_barras)
);

CREATE TABLE pedido(
id_pedido integer,
numero_articulos integer,
total double,
fecha_pedido timestamp,
PRIMARY KEY(id_pedido)
);

CREATE TABLE cliente(
id_cliente integer,
nombre_cliente varchar(30),
apellido_paterno_cliente varchar(30),
apellido_materno_cliente varchar(30),
telefono_cliente integer,
correo varchar(50),
tarjeta_de_credito integer,
PRIMARY KEY(id_cliente)
);

CREATE TABLE direccion_cliente(
calle_cliente varchar(50),
estado_cliente varchar(30),
numero_cliente integer,
colonia_cliente varchar(50),
municipio_delegacion_cliente varchar(50),
id_direccion_cliente integer,
FOREIGN KEY(id_direccion_cliente) REFERENCES cliente(id_cliente) ON DELETE CASCADE
);

CREATE TABLE sucursal(
id_sucursal integer,
nombre_sucursal varchar(30),
telefono_sucursal integer,
balance double,
PRIMARY KEY(id_sucursal)
);

CREATE TABLE direccion_sucursal(
calle_sucursal varchar(50),
estado_sucursal varchar(30),
numero_sucursal integer,
colonia_sucursal varchar(50),
municipio_delegacion_sucursal varchar(50),
id_direccion_sucursal integer,
FOREIGN KEY(id_direccion_sucursal) REFERENCES sucursal(id_sucursal) ON DELETE CASCADE
);

CREATE TABLE empleado(
id_empleado integer,
nombre_empleado varchar(30),
apellido_paterno_empleado varchar(30),
apellido_materno_empleado varchar(30),
fecha_de_nacimiento timestamp,
fecha_de_ingreso timestamp,
posicion varchar(50),
PRIMARY KEY(id_empleado)
);

CREATE TABLE distribuye_a(
id_marca_distribuye_a integer,
id_distribuidor_distribuye_a integer,
PRIMARY KEY(id_marca_distribuye_a),
FOREIGN KEY(id_marca_distribuye_a) REFERENCES marca(id_marca) ON DELETE CASCADE,
FOREIGN KEY(id_distribuidor_distribuye_a) REFERENCES distribuidor(id_distribuidor) ON DELETE CASCADE
);

CREATE TABLE es_dueño_de(
codigo_es_dueño_de integer,
id_marca_es_dueño_de integer,
PRIMARY KEY(codigo_es_dueño_de),
FOREIGN KEY(codigo_es_dueño_de) REFERENCES juguete(codigo_de_barras) ON DELETE CASCADE,
FOREIGN KEY(id_marca_es_dueño_de) REFERENCES marca(id_marca) ON DELETE CASCADE
);

CREATE TABLE transaccion(
id_pedido_transaccion integer,
id_sucursal_transaccion integer,
codigo_transaccion integer,
PRIMARY KEY(id_pedido_transaccion,id_sucursal_transaccion,codigo_transaccion),
FOREIGN KEY(id_pedido_transaccion) REFERENCES pedido(id_pedido) ON DELETE CASCADE,
FOREIGN KEY(id_sucursal_transaccion) REFERENCES sucursal(id_sucursal) ON DELETE CASCADE,
FOREIGN KEY(codigo_transaccion) REFERENCES juguete(codigo_de_barras) ON DELETE CASCADE
);

CREATE TABLE realiza_compra(
id_pedido_realiza_compra integer,
id_cliente_realiza_compra integer,
PRIMARY KEY(id_pedido_realiza_compra),
FOREIGN KEY(id_pedido_realiza_compra) REFERENCES pedido(id_pedido) ON DELETE CASCADE,
FOREIGN KEY(id_cliente_realiza_compra) REFERENCES cliente(id_cliente) ON DELETE CASCADE
);

CREATE TABLE trabaja_en(
id_empleado_trabaja_en integer,
id_sucursal_trabaja_en integer,
PRIMARY KEY(id_empleado_trabaja_en),
FOREIGN KEY(id_empleado_trabaja_en) REFERENCES empleado(id_empleado) ON DELETE CASCADE,
FOREIGN KEY(id_sucursal_trabaja_en) REFERENCES sucursal(id_sucursal) ON DELETE CASCADE
);











