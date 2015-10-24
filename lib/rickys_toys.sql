PRAGMA foreign_keys = ON;

CREATE TABLE distribuidor(
id_distribuidor integer,
nombre_distribuidor varchar(30),
deuda double,
PRIMARY KEY(id_distribuidor)
);

INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (1,"Sociis Natoque Penatibus LLC",8739);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (2,"Pede Incorporated",3238);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (3,"Vitae Semper Foundation",3449);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (4,"Integer Urna Vivamus Foundation",7987);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (5,"Eget Laoreet Foundation",2375);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (6,"Non PC",5287);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (7,"Laoreet Libero Et Limited",7145);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (8,"Semper PC",5526);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (9,"Ut Foundation",3527);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (10,"Sem Egestas Consulting",9114);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (11,"Risus Donec LLP",9);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (12,"Dui Cum Sociis Company",253);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (13,"Diam Nunc Corp.",4802);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (14,"Tincidunt Congue Limited",2389);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (15,"Et Euismod Corp.",9642);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (16,"Enim Gravida LLP",9754);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (17,"Tellus Nunc Ltd",6708);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (18,"Praesent Eu Associates",9367);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (19,"Duis Corporation",5761);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (20,"Ultrices Inc.",7040);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (21,"Mus Proin LLP",952);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (22,"Neque PC",4147);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (23,"Arcu Ac Orci Industries",9084);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (24,"Volutpat Nulla Limited",8032);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (25,"Etiam Laoreet Corp.",7790);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (26,"Eget Corporation",7138);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (27,"Eget Metus Foundation",3024);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (28,"Gravida LLP",9697);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (29,"Mauris Industries",2895);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (30,"Dictum Mi Ac Corp.",6009);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (31,"Sed Neque Sed Corp.",2334);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (32,"Erat Eget Ipsum Institute",6843);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (33,"Consequat Company",6860);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (34,"Dolor Nulla Semper LLC",2811);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (35,"Ornare Foundation",4215);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (36,"Sit Amet Consectetuer Inc.",1779);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (37,"Magna A Neque Company",2606);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (38,"Ac Corp.",6428);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (39,"Arcu Institute",7370);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (40,"Curabitur Vel Industries",2443);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (41,"Morbi Associates",4136);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (42,"Mi Ac Mattis Consulting",4813);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (43,"Auctor LLC",758);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (44,"Vel Nisl Quisque Corporation",1118);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (45,"Sagittis Lobortis Institute",2482);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (46,"Gravida Mauris Consulting",643);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (47,"Gravida LLC",9269);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (48,"Egestas Nunc Sed Ltd",5151);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (49,"Dui Industries",4140);
INSERT INTO distribuidor (id_distribuidor,nombre_distribuidor,deuda) VALUES (50,"Orci Corp.",8334);

CREATE TABLE marca(
id_marca integer,
nombre_marca varchar(30),
PRIMARY KEY(id_marca)
);

INSERT INTO marca (id_marca,nombre_marca) VALUES (1,"Sagittis Lobortis Mauris LLC");
INSERT INTO marca (id_marca,nombre_marca) VALUES (2,"Ultricies Dignissim Lacus LLP");
INSERT INTO marca (id_marca,nombre_marca) VALUES (3,"Augue Scelerisque LLC");
INSERT INTO marca (id_marca,nombre_marca) VALUES (4,"Eu LLP");
INSERT INTO marca (id_marca,nombre_marca) VALUES (5,"Magna Nam Ligula Company");
INSERT INTO marca (id_marca,nombre_marca) VALUES (6,"Donec Sollicitudin Adipiscing Limited");
INSERT INTO marca (id_marca,nombre_marca) VALUES (7,"Amet Risus Donec Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (8,"Penatibus Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (9,"Nec Consulting");
INSERT INTO marca (id_marca,nombre_marca) VALUES (10,"Ligula Aliquam Erat Limited");
INSERT INTO marca (id_marca,nombre_marca) VALUES (11,"Elementum Lorem Ut Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (12,"Mattis Semper Associates");
INSERT INTO marca (id_marca,nombre_marca) VALUES (13,"Adipiscing Elit Curabitur Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (14,"Leo Cras Vehicula Industries");
INSERT INTO marca (id_marca,nombre_marca) VALUES (15,"Vitae Industries");
INSERT INTO marca (id_marca,nombre_marca) VALUES (16,"Arcu Vivamus Corp.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (17,"Mauris A Nunc Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (18,"Sed Nec Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (19,"Netus Industries");
INSERT INTO marca (id_marca,nombre_marca) VALUES (20,"Faucibus Ut Nulla Consulting");
INSERT INTO marca (id_marca,nombre_marca) VALUES (21,"Consequat Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (22,"Donec Institute");
INSERT INTO marca (id_marca,nombre_marca) VALUES (23,"Arcu Eu Associates");
INSERT INTO marca (id_marca,nombre_marca) VALUES (24,"Velit Eget Institute");
INSERT INTO marca (id_marca,nombre_marca) VALUES (25,"Consectetuer Adipiscing PC");
INSERT INTO marca (id_marca,nombre_marca) VALUES (26,"Quisque Limited");
INSERT INTO marca (id_marca,nombre_marca) VALUES (27,"At Libero Morbi Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (28,"Est Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (29,"Sed Id Risus Incorporated");
INSERT INTO marca (id_marca,nombre_marca) VALUES (30,"Non Massa Non Limited");
INSERT INTO marca (id_marca,nombre_marca) VALUES (31,"Ut Dolor Dapibus Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (32,"Egestas Lacinia Sed Associates");
INSERT INTO marca (id_marca,nombre_marca) VALUES (33,"Nunc Sollicitudin Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (34,"Nec Urna Et Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (35,"Etiam Vestibulum Massa Corp.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (36,"Fames Ac Turpis PC");
INSERT INTO marca (id_marca,nombre_marca) VALUES (37,"At Auctor Ullamcorper Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (38,"At Lacus Quisque Company");
INSERT INTO marca (id_marca,nombre_marca) VALUES (39,"Cursus Diam At Institute");
INSERT INTO marca (id_marca,nombre_marca) VALUES (40,"Pede Consulting");
INSERT INTO marca (id_marca,nombre_marca) VALUES (41,"Dui Limited");
INSERT INTO marca (id_marca,nombre_marca) VALUES (42,"Non Lorem Associates");
INSERT INTO marca (id_marca,nombre_marca) VALUES (43,"Non Arcu Vivamus Inc.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (44,"Est Ac Corporation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (45,"Aliquet Metus Company");
INSERT INTO marca (id_marca,nombre_marca) VALUES (46,"Quis Corp.");
INSERT INTO marca (id_marca,nombre_marca) VALUES (47,"Faucibus Morbi Consulting");
INSERT INTO marca (id_marca,nombre_marca) VALUES (48,"Ornare Fusce Mollis Institute");
INSERT INTO marca (id_marca,nombre_marca) VALUES (49,"Massa Vestibulum Accumsan Foundation");
INSERT INTO marca (id_marca,nombre_marca) VALUES (50,"Vitae Aliquet Nec Ltd");

CREATE TABLE juguete(
codigo_de_barras integer,
nombre_juguete varchar(50),
precio double,
clasificacion integer,
PRIMARY KEY(codigo_de_barras)
);

INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (1,"Transformer",807,18);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (2,"Ultron",821,16);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (3,"Barbie Doctora",451,4);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (4,"LEGO Marvel",837,10);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (5,"LEGO DC Comics",949,2);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (6,"Cocinita",516,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (7,"Casa de muñecas",972,16);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (8,"Patineta voladora",558,7);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (9,"Micro hornito",932,1);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (10,"JENGA BOOM",460,19);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (11,"Plastilina playdoh",112,4);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (12,"Carros",241,20);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (13,"Super yoyo",696,16);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (14,"Figuras de accion coleccion",901,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (15,"Cartas magicas",496,8);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (16,"Super cubo magico",875,5);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (17,"Carro control remoto",289,15);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (18,"Dados",10,18);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (19,"Diana",145,7);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (20,"Pistola de agua",337,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (21,"Turista",469,20);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (22,"UNO robot",838,7);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (23,"Bebe magico",601,7);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (24,"Hombre de accion",475,19);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (25,"Luchador",138,18);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (26,"Lona para luchadores",548,1);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (27,"Matatena espacial",535,19);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (28,"Dron",947,7);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (29,"Pizarron magico",7,7);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (30,"Pluma invicible",535,18);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (31,"YOYO",180,15);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (32,"Vaquero",319,5);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (33,"Dinosaurio",228,1);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (34,"Coleccion dinosaurios",578,6);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (35,"Balero",111,1);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (36,"Balero del chavo",622,4);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (37,"Maquilla de muñecas",791,20);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (38,"Guitarra",464,3);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (39,"Matatena",56,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (40,"Tenis veloces",760,11);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (41,"Morfo",623,5);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (42,"Power Ranger",646,10);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (43,"Hombre de acero",839,3);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (44,"Robot destructor",882,1);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (45,"Consola basica de juegos",964,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (46,"Palillos chinos",160,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (47,"Ajedrez medieval",661,13);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (48,"Castillo",894,4);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (49,"Diadema de princesa",140,12);
INSERT INTO juguete (codigo_de_barras,nombre_juguete,precio,clasificacion) VALUES (50,"Loteria",30,6);

CREATE TABLE pedido(
id_pedido integer,
numero_articulos integer,
total double,
fecha_pedido timestamp,
PRIMARY KEY(id_pedido)
);

INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (1,237,6867,"09/25/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (2,3,2538,"07/12/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (3,320,1833,"10/16/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (4,271,9746,"05/04/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (5,452,4000,"10/13/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (6,288,8393,"01/13/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (7,333,3169,"06/26/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (8,59,3490,"01/05/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (9,460,2692,"03/02/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (10,483,2449,"12/02/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (11,92,2454,"10/18/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (12,42,9234,"10/21/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (13,128,3523,"07/21/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (14,120,8384,"05/20/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (15,441,6196,"10/29/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (16,97,6580,"12/25/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (17,192,7289,"01/09/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (18,143,8063,"03/13/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (19,321,8682,"03/03/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (20,236,3180,"04/15/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (21,500,5882,"08/14/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (22,123,192,"10/07/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (23,25,8074,"12/26/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (24,234,7538,"08/25/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (25,142,1666,"11/16/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (26,244,402,"09/11/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (27,91,7890,"05/18/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (28,73,9231,"12/15/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (29,43,8936,"10/01/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (30,347,6769,"05/19/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (31,379,7587,"03/06/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (32,287,339,"08/25/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (33,438,7886,"08/25/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (34,130,4806,"01/29/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (35,296,8230,"01/08/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (36,38,9714,"04/15/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (37,423,1758,"05/12/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (38,184,6445,"05/25/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (39,236,9377,"09/07/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (40,423,9970,"04/18/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (41,111,5961,"07/14/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (42,414,9563,"09/20/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (43,382,2374,"12/02/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (44,44,1078,"05/22/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (45,174,9731,"11/24/14");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (46,368,1451,"09/03/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (47,495,6663,"09/05/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (48,416,1299,"06/25/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (49,83,733,"07/16/15");
INSERT INTO pedido (id_pedido,numero_articulos,total,fecha_pedido) VALUES (50,269,2848,"09/08/15");

CREATE TABLE cliente(
id_cliente integer,
nombre_cliente varchar(30),
apellido_paterno_cliente varchar(30),
apellido_materno_cliente varchar(30),
telefono_cliente double,
correo varchar(50),
tarjeta_de_credito double,
PRIMARY KEY(id_cliente)
);

INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (1,"Yuli","Constance Pate","Clio Knight",5521192766,"bibendum@odioauctor.com","5159471787502981");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (2,"Hop","Whitney Hawkins","Brennan Vaughn",5561726364,"velit.Quisque@dolorDonec.com","5399821015773349");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (3,"Cruz","Ginger Hurley","Tad Mayer",5548295291,"est@et.org","5328305607181972");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (4,"Emily","Justina Downs","Fiona Lynn",5554332818,"velit@fermentum.com","5110094101782885");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (5,"Joy","Janna Charles","Hayden Brady",5540180617,"massa.non@ipsumsodales.org","5391859996751886");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (6,"Uriah","Ina Santos","Raya Reilly",5599469448,"est.Mauris@convallisest.ca","346212463865051");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (7,"Clementine","Lacy Huffman","Cheyenne Spence",5515836876,"et.nunc.Quisque@PhasellusornareFusce.net","376334269732235");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (8,"Uma","Hasad Levy","Ishmael Elliott",5589141095,"enim@Donec.edu","348492484439169");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (9,"Keiko","Camden Mitchell","Harding Stephenson",5540905186,"Vivamus.rhoncus.Donec@magnisdisparturient.net","379845357046464");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (10,"Aquila","Medge Davidson","Wynter Farrell",5507500182,"dui.augue.eu@parturientmontesnascetur.co.uk","5183818925651726");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (11,"Scarlett","Stuart Davidson","Leah Oconnor",5550894460,"fringilla.porttitor@atortor.org","4624023289652543");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (12,"Ifeoma","Yuli Gutierrez","Guy Bridges",5520278403,"eu@tincidunt.edu","5341225246712564");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (13,"Tate","Juliet Joyce","Lucius Tran",5538852926,"pretium@mi.net","375160919348248");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (14,"Emma","Diana Villarreal","Ingrid Ewing",5582233576,"ante@Donec.ca","4536794152716176");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (15,"Garrison","Ulric Mckee","Iliana Hunter",5567743006,"Aenean.euismod@vulputate.edu","4734756768774246");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (16,"Cullen","Igor Bush","Odysseus Baird",5567128971,"nostra.per.inceptos@felis.com","348273299423040");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (17,"Branden","Dakota Stuart","Nomlanga Ray",5557592686,"velit.Cras@eu.ca","5342699680016370");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (18,"Callie","Idola Valdez","Wyoming Santana",5596097123,"Phasellus.vitae@aauctor.com","4943344643618915");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (19,"Ebony","Kenneth Montoya","Laurel Conrad",5543326028,"est@vitae.ca","5393132347231735");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (20,"Chanda","Ulla Oneal","Haviva Vaughan",5583450640,"ad@maurisutmi.ca","374816920128654");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (21,"Lee","Donna Riggs","Jada Burnett",5594810747,"lacinia.orci@per.org","5341791644305927");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (22,"Kiayada","Kareem Jimenez","Isaac Cunningham",5509998557,"mi@acfacilisis.net","5336519599333409");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (23,"Paki","Reagan Wood","Laurel Lewis",5529573096,"felis@Maurisvel.ca","348365621333945");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (24,"Rhea","Serena Barr","Germane Brady",5524053098,"fringilla@elitdictum.edu","4945257741771636");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (25,"Nita","Inez Cole","Isabella Dickson",5574839879,"est.Nunc@nequeNullamnisl.org","5149554631519134");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (26,"Colby","Adara Shields","Kaitlin Sawyer",5544194111,"tincidunt.aliquam@nonummyFuscefermentum.co.uk","5111447436618617");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (27,"Willa","Vielka Sampson","Timon Mcbride",5566295859,"et@malesuada.com","4342591062048454");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (28,"Tara","Fleur Mccullough","Bryar Martin",5549252141,"tellus.id@vulputate.edu","5110447950949890");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (29,"Naida","Dacey Walters","Mariko Hughes",5567186885,"non.magna.Nam@amet.ca","374285308573392");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (30,"Kylynn","Preston Lamb","Virginia Goodman",5564160568,"Curabitur.massa@ipsum.edu","5233332183090967");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (31,"Cade","Herman Shaffer","Gemma Raymond",5542022077,"Aenean.sed@tincidunt.com","346414366457143");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (32,"Kylee","Oscar Powers","Dakota Welch",5577071000,"Nam.consequat.dolor@commodo.org","5192324873236930");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (33,"Orlando","Preston Ball","Veda Bryan",5516087526,"leo@Morbi.com","373315319886431");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (34,"Leo","Anjolie Rosales","Matthew Blevins",5517891565,"vestibulum.massa.rutrum@erat.co.uk","5182449271753436");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (35,"Keely","Aurora Gibson","Marcia Burgess",5572035502,"volutpat.nunc@Sed.co.uk","4924189750198277");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (36,"Whoopi","Kane Conway","Maile Gregory",5594439228,"facilisis@tristiquesenectus.edu","5125013195616190");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (37,"Ivor","Rahim Wong","Mariam Velez",5534040588,"ornare.egestas@molestieSed.ca","5344573910403993");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (38,"Chelsea","Dana Walton","Chantale Carpenter",5570217077,"dui.quis@sedorci.ca","345576167238418");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (39,"Demetrius","Evelyn Maynard","Caldwell Abbott",5570266599,"non.quam.Pellentesque@molestiein.org","379993804004975");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (40,"Hyatt","Bree Ortega","Walter Vincent",5507198743,"ornare@congue.co.uk","5343027480868623");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (41,"Chanda","Tanisha Wade","Richard Watkins",5590820962,"molestie.tortor.nibh@eu.edu","343958059803580");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (42,"Reagan","Illana Dodson","Kiayada Wolf",5585021780,"Aliquam.nisl.Nulla@porttitor.co.uk","5162340369015004");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (43,"Ulysses","Ora Mendez","Medge Burns",5514549849,"ligula.Nullam@ac.edu","347425272758118");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (44,"Medge","Rosalyn Dawson","Roary Holcomb",5537883691,"fermentum.risus@ultricies.ca","378118979151820");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (45,"Eliana","Gregory Sweeney","Daniel Lucas",5547867139,"venenatis@nisi.ca","371601978428662");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (46,"Octavia","Dahlia Lawrence","Hadassah Chaney",5589694811,"non.dui.nec@orciluctuset.net","344772840445861");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (47,"Alma","Savannah Rollins","Carl Jennings",5535599406,"luctus.et.ultrices@sit.org","4639227857906376");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (48,"Yuri","Chadwick Carson","Shelley Stone",5546900244,"libero.et@dictumcursusNunc.ca","4487194643029940");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (49,"Neville","Perry Brooks","Wesley Allison",5564693445,"Proin.mi.Aliquam@seddolor.edu","374206286882054");
INSERT INTO cliente (id_cliente,nombre_cliente,apellido_paterno_cliente,apellido_materno_cliente,telefono_cliente,correo,tarjeta_de_credito) VALUES (50,"Joelle","Tana Meadows","Odessa Drake",5534994940,"mauris.rhoncus.id@eget.edu","345705513302230");

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
telefono_sucursal double,
balance double,
PRIMARY KEY(id_sucursal)
);

INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (1,"AQ",5521687421,48240);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (2,"Mississippi",5514933351,32434);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (3,"GA",5524716973,41437);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (4,"Idaho",5583991616,91909);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (5,"AZ",5541505938,56178);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (6,"BE",5579573258,36388);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (7,"AL",5552079748,76095);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (8,"Madrid",5554820564,15507);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (9,"Rajasthan",5550932139,50434);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (10,"Utah",5565975198,16825);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (11,"KC",5565359768,45173);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (12,"Wie",5553675379,2647);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (13,"North Island",5558529705,10311);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (14,"South Island",5595850117,28750);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (15,"LU",5513078214,82409);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (16,"łódzkie",5516896206,35509);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (17,"Alabama",5578227284,71820);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (18,"Lazio",5597129577,97754);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (19,"Diy",5527304386,47688);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (20,"NSW",5568201282,80518);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (21,"PA",5525103366,56708);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (22,"Connacht",5543814570,42181);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (23,"Gaz",5535963601,89681);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (24,"NO",5590237319,28601);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (25,"Munster",5537940628,55388);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (26,"Victoria",5545423958,70194);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (27,"Konya",5501069127,88954);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (28,"Şanlıurfa",5557398965,92435);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (29,"Noord Brabant",5573898005,55556);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (30,"Rio Grande do Sul",5543161055,12423);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (31,"UP",5513267659,2235);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (32,"Washington",5580497436,61734);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (33,"NÖ",5534841245,37671);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (34,"Andhra Pradesh",5525124106,26808);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (35,"Kinross-shire",5523150775,87486);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (36,"GL",5575928644,7396);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (37,"NI",5593420834,97789);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (38,"Lombardia",5509133053,8398);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (39,"BA",5520089727,93245);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (40,"Ist",5519036086,26100);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (41,"Stm",5574111699,75830);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (42,"VIC",5541003369,35051);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (43,"Gelderland",5584267434,16849);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (44,"Manitoba",5559005645,68396);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (45,"MA",5561473345,60451);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (46,"NE",5568282242,42655);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (47,"RS",5587903027,15069);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (48,"QC",5557518469,49963);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (49,"KP",5537431117,5504);
INSERT INTO sucursal (id_sucursal,nombre_sucursal,telefono_sucursal,balance) VALUES (50,"QLD",5561984484,44061);

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

INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (1,"Tamara","Riley Albert","Silas Park","12/31/69","12/27/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (2,"Marny","Kyla Ray","Drew Mcmahon","12/31/69","08/29/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (3,"Knox","Cameron Slater","Axel Hahn","12/31/69","09/15/15","Gerente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (4,"Zenaida","Octavia Singleton","Michelle Lucas","12/31/69","07/11/16","Limpieza");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (5,"Ahmed","Austin Stark","Cruz Rivera","12/31/69","07/12/16","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (6,"Dean","Roary Mitchell","Jerome Burton","12/31/69","03/22/15","Asistente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (7,"Ali","Jacob Pollard","Kyla Pacheco","12/31/69","11/20/15","Gerente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (8,"Kaye","Mollie Romero","Ulla Dawson","12/31/69","10/05/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (9,"TaShya","Audra Robbins","Mollie Henderson","12/31/69","02/19/15","Limpieza");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (10,"Irene","Olympia Jenkins","Nerea Clay","12/31/69","01/14/16","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (11,"Hector","Miranda Hubbard","Marsden Jacobs","12/31/69","10/22/15","Botarga");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (12,"Oscar","Dai Franklin","Cheryl Crane","12/31/69","10/31/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (13,"Deanna","Neil Hodges","Nayda Mullen","12/31/69","11/23/15","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (14,"Skyler","September Bennett","Reese Stevenson","12/31/69","11/02/15","Gerente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (15,"Yetta","Keelie Bernard","Rachel Meyers","12/31/69","12/04/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (16,"Caryn","Darius Garrett","Georgia Diaz","12/31/69","07/29/15","Limpieza");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (17,"Rhona","Alika Carver","Paloma Tyler","12/31/69","03/07/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (18,"Leroy","Myra Tate","Tarik Pate","12/31/69","01/04/15","Ejecutivo");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (19,"Hammett","Camille Wilson","Amela Weaver","12/31/69","01/07/16","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (20,"Jacqueline","Aubrey Dawson","Elijah Carson","12/31/69","11/25/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (21,"Gloria","Jonas Newton","Naida Clark","12/31/69","08/22/16","Vendedor");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (22,"Lana","Nell Cummings","Lana Munoz","12/31/69","06/03/15","Volantero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (23,"Lee","Amos Edwards","Josiah Rodriguez","12/31/69","09/25/16","Volantero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (24,"Joelle","Jemima Kennedy","Abra Phillips","12/31/69","02/21/16","Limpieza");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (25,"Serina","Janna Witt","Wanda Ochoa","12/31/69","10/21/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (26,"Venus","Serina Wheeler","Hillary Joseph","12/31/69","04/28/16","Gerente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (27,"Guy","Noelle David","Kato Gutierrez","12/31/69","04/25/16","Ejecutivo");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (28,"Shannon","Raymond Dyer","Shaeleigh Valentine","12/31/69","07/08/16","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (29,"Simon","Cameron Cook","Whilemina Irwin","12/31/69","02/07/16","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (30,"Conan","Myles Davis","Fuller Dorsey","12/31/69","05/11/16","Limpieza");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (31,"Joan","Isadora Pollard","Kenneth Pate","12/31/69","11/02/14","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (32,"Keane","Hakeem Dixon","Debra Kirkland","12/31/69","03/26/15","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (33,"Celeste","Wang Mosley","Noble Shannon","12/31/69","05/21/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (34,"Abbot","Jonas Meyers","Cailin Chan","12/31/69","11/29/15","Volantero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (35,"Keefe","Kato Alvarado","Malachi Wilkinson","12/31/69","03/25/15","Botarga");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (36,"Cooper","Margaret Mcclain","Faith Hays","12/31/69","09/24/15","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (37,"Cecilia","Denton Stanton","Hammett Middleton","12/31/69","01/25/15","Gerente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (38,"Brenden","Jason Lynch","Lila Valdez","12/31/69","05/30/15","Asistente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (39,"Donovan","Hermione Cross","Wynter Kirk","12/31/69","03/01/16","Asistente");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (40,"Lydia","Yetta Jenkins","Daria Barnes","12/31/69","05/14/16","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (41,"Lance","Marvin Dawson","Jolene Reed","12/31/69","01/06/16","Ejecutivo");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (42,"Ignacia","Armand Kramer","Hector Adkins","12/31/69","02/15/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (43,"Amal","Freya Fitzpatrick","Cameron Herrera","12/31/69","01/04/16","Mostrador");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (44,"Sierra","Kameko Meyers","Kevin Guzman","12/31/69","09/07/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (45,"Ebony","Cally Randolph","Gillian Hill","12/31/69","03/19/15","Limpieza");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (46,"Isabella","Kiara Mcguire","Savannah Hess","12/31/69","11/05/14","Botarga");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (47,"Ashton","Dane Singleton","Montana Terry","12/31/69","08/24/16","Volantero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (48,"Channing","Keaton Henry","Jana Fernandez","12/31/69","01/21/15","Cajero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (49,"Nyssa","Maite Raymond","Uriel Owen","12/31/69","10/06/15","Volantero");
INSERT INTO empleado (id_empleado,nombre_empleado,apellido_paterno_empleado,apellido_materno_empleado,fecha_de_nacimiento,fecha_de_ingreso,posicion) VALUES (50,"Gray","Shana Thompson","Piper Mayer","12/31/69","05/12/15","Gerente");

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












