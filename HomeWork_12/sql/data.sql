insert into driver (first_name, last_name, phone, experience, age, license, category, rating)
values  ('Иван', 'Иванов', '79171111111', 5, 25, true, 'B', 5),
        ('Петр', 'Петров', '79172222222', 0, 18, false, '', 0),
        ('Семен', 'Сидоров', '79173333333', 3, 30, true, 'B', 4),
        ('Ольга', 'Семенова', '79174444444', 7, 33, true, 'B', 3),
        ('Екатерина', 'Сидорова', '79995555555', 1, 25, true, 'B', 5);

insert into car (model, color, car_number, owner_id)
values  ('Toyota Camry', 'Black', 'В456ТМ16', 1),
        ('Toyota Rav4', 'White', 'Е789КХ102', 2),
        ('BMW Series 5', 'Blue', 'А777АА716', 3),
        ('Mazda 3', 'Red', 'В123КК116', 3),
        ('Kia Rio', 'White', 'С321ТУ77', 4);

insert into trip (driver_id, car_id, trip_date, trip_time)
values  (1, 1, '2022-11-10', '04:35'),
        (3, 3, '2022-11-11', '02:47'),
        (3, 2, '2022-11-15', '00:40'),
        (4, 4, '2022-11-20', '00:50'),
        (4, 4, '2022-11-21', '00:30'),
        (5, 3, '2022-11-21', '01:30'),
        (5, 3, '2022-11-21', '02:18');