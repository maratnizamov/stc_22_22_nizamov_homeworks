drop table if exists trip;
drop table if exists car;
drop table if exists driver cascade ;

create table driver
(
    id serial primary key,
    first_name char(20) not null,
    last_name char(20) not null,
    phone char(15),
    experience integer,
    age integer check (age >= 18 and age <= 99),
    license bool,
    category char(10),
    rating integer check (rating >= 0 and rating <= 5) default 0
);

create table car
(
    id serial primary key,
    model char(20) not null,
    color char(20),
    car_number char(20) unique not null,
    owner_id integer not null,
    foreign key (owner_id) references driver (id)
);

create table trip
(
    driver_id integer not null,
    car_id integer not null,
    trip_date date not null,
    trip_time time not null,
    foreign key (driver_id) references driver (id),
    foreign key (car_id) references car (id)
);