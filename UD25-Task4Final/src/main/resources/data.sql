drop table if exists salas;
drop table if exists peliculas;

create table peliculas(
	codigo int auto_increment,
    nombre varchar(100),
    calificacionedad int,
    primary key (codigo)
);
create table salas(
	codigo int auto_increment,
    nombre varchar(100),
    pelicula int,
    primary key (codigo),
    foreign key (pelicula) references peliculas(codigo)
    );

insert into peliculas (nombre, calificacionedad) values('Malditos bastardos', 12);
insert into peliculas (nombre, calificacionedad) values('Gran torino', 12);

insert into salas (nombre, pelicula) values('uno', 1);
insert into salas (nombre, pelicula) values('dos', 2);
