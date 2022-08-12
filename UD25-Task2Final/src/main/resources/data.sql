drop table if exists empleados;
drop table if exists departamentos;

create table departamentos(
	codigo int auto_increment not null,
    nombre varchar(100),
    presupuesto int,
    primary key (codigo)
);

Create table empleados(
	dni varchar(8),
	nombre varchar(100),
	apellidos varchar(255),
	departamento int,
	primary key (dni),
	foreign key (departamento) references departamentos(codigo)
);

insert into departamentos(nombre,presupuesto) values('I+D', 10000);
insert into departamentos(nombre,presupuesto) values('patata', 13000);

insert into empleados values('48667795', 'Marc', 'Cuenca Diaz', 1);
insert into empleados values('48667387', 'amaila', 'Cuenca Duran', 2);