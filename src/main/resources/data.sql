insert into room(id, name)
values (1, 'First room');
insert into room(id, name)
values (2, 'Second room');
insert into room(id, name)
values (3, 'Third room');

insert into movie(id, name)
values (1,'Władca Pierścieni: Drużyna Pierścienia');
insert into movie(id, name)
values (2,'Władca Pierścieni: Dwie Wieże');
insert into movie(id, name)
values (3,'Władca Pierścieni: Powrót Króla');

insert into screening (id,movie_id, start_date, end_date,room_id )
values (1,1, '2023-05-23 15:00','2023-05-23 17:30', 1);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (2,1, '2023-05-24 16:00','2023-05-24 18:30', 2);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (3,1, '2023-05-25 18:00','2023-05-25 20:30', 3);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (4,2, '2023-05-23 15:30','2023-05-23 18:30', 2);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (5,2, '2023-05-24 19:30','2023-05-24 22:30', 3);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (6,2, '2023-05-25 17:30','2023-05-25 20:00', 1);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (7,3, '2023-05-23 17:30','2023-05-23 21:00', 3);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (8,3, '2023-05-24 15:30','2023-05-24 19:00', 1);

insert into screening (id,movie_id, start_date, end_date,room_id )
values (9,3, '2023-05-25 17:00','2023-05-25 20:30', 2);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (1, 'A1', 'A', 1, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (2, 'A2', 'A', 2, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (3, 'A3', 'A', 3, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (4, 'A4', 'A', 4, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (5, 'A5', 'A', 5, 1);
INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (6, 'B1', 'B', 1, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (7, 'B2', 'B', 2, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (8, 'B3', 'B', 3, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (9, 'B4', 'B', 4, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (10, 'B5', 'B', 5, 1);
INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (11, 'C1', 'C', 1, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (12, 'C2', 'C', 2, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (13, 'C3', 'C', 3, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (14, 'C4', 'C', 4, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
VALUES (15, 'C5', 'C', 5, 1);

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
SELECT ID + 15, NAME, ROW_NAME, COLUMN_NAME, 2
FROM seat
WHERE ID BETWEEN 1 AND 15;

INSERT INTO seat (ID, NAME, ROW_NAME, COLUMN_NAME, ROOM_ID)
SELECT ID + 30, NAME, ROW_NAME, COLUMN_NAME, 3
FROM seat
WHERE ID BETWEEN 1 AND 15;

insert into reservation (ID, 	NAME, 	SURNAME,  	SCREENING_ID , 	SEAT_ID )
values (1, 'Ania', 'Szyamsnka', 1, 1);




