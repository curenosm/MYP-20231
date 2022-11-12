create sequence hibernate_sequence start with 1 increment by 1;
create table nave (id bigint not null, nombre varchar(255), primary key (id));
create table ranking (id bigint not null, fecha timestamp, puntuacion bigint, user_id bigint, primary key (id));
create table users (id bigint not null, active boolean not null, email varchar(255), password varchar(255), roles varchar(255), username varchar(255), primary key (id));
alter table ranking add constraint FK3fvvh22u2cwktrkpu73la05yp foreign key (user_id) references users;
INSERT INTO `users` (ID, USERNAME, PASSWORD, ACTIVE, EMAIL, ROLES) VALUES (1, 'usuario','navesespaciales',  true, 'admin@admin.com', 'ADMIN');
