drop table if exists cajas;
drop table if exists almacenes;

create table almacenes(
	codigo int auto_increment,
    lugar varchar(100),
    capacidad int,
    primary key (codigo)
);

Create table cajas(
	numreferencia char(5),
	contenido varchar(100),
	valor int,
	almacen int,
	primary key (numreferencia),
	foreign key (almacen) references almacenes(codigo)
);

insert into almacenes(lugar, capacidad) values('Tarragona', 10000);
insert into almacenes(lugar,capacidad) values('Barcelona', 13000);

insert into cajas values('1', 'patata', 1000, 1);
insert into cajas values('2', 'manzana', 2000, 1);
insert into cajas values('3', 'manzana', 2000, 1);