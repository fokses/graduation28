insert into users values ( 1, 'admin@gmail.com','Ruslan', 'Budaiev');
insert into users values ( 2, 'user@gmail.com','Mykola', 'Kuznecov');
insert into users values ( 3, 'user2@gmail.com','Sergey', 'Shevchenko');

insert into user_role values ( 1, 'ADMIN' );
insert into user_role values ( 1, 'USER' );
insert into user_role values ( 2, 'USER' );
insert into user_role values ( 3, 'USER' );;

insert into restaurant values ( 1, 'Gogi' );
insert into restaurant values ( 2, 'Musafir' );
insert into restaurant values ( 3, 'Puzata hata' );
insert into restaurant values ( 4, 'Diners' );
insert into restaurant values ( 5, 'Oy, mama' );

insert into meal values ( 1, 'Борщ украинский' );
insert into meal values ( 2, 'Суп гречневый' );
insert into meal values ( 3, 'Суп гороховый' );
insert into meal values ( 4, 'Каша гречневая' );
insert into meal values ( 5, 'Каша рисовая' );
insert into meal values ( 6, 'Картофель отварной' );
insert into meal values ( 7, 'Котлета по киевски' );
insert into meal values ( 8, 'Котлета по донбасски' );
insert into meal values ( 9, 'Котлета по донбасски' );
insert into meal values ( 10, 'Набор чебуреков 3 шт' );
insert into meal values ( 11, 'Плов' );
insert into meal values ( 12, 'Набор янтыков 3 шт' );
insert into meal values ( 13, 'Суп харчо' );
insert into meal values ( 14, 'Хинкали 6 шт.' );
insert into meal values ( 15, 'Чахохбили' );
insert into meal values ( 16, 'Бычьи яйца' );

insert into menu values ( 1, '2023-03-15', 4 );
insert into menu values ( 2, '2023-03-15', 3 );
insert into menu values ( 3, '2023-03-15', 2 );
insert into menu values ( 4, '2023-03-15', 1 );
insert into menu values ( 5, '2023-03-16', 1 );
insert into menu values ( 6, '2023-03-16', 2 );
insert into menu values ( 7, '2023-03-16', 3 );

insert into menu_item values ( 1, 1, 1, 50 );
insert into menu_item values ( 2, 1, 4, 20 );
insert into menu_item values ( 3, 1, 7, 70 );
insert into menu_item values ( 4, 2, 2, 50 );
insert into menu_item values ( 5, 2, 5, 30 );
insert into menu_item values ( 6, 2, 9, 60 );
insert into menu_item values ( 7, 3, 10, 150 );
insert into menu_item values ( 8, 4, 14, 150 );
insert into menu_item values ( 9, 4, 13, 100 );
insert into menu_item values ( 10, 5, 15, 200 );
insert into menu_item values ( 11, 6, 12, 210 );
insert into menu_item values ( 12, 7, 3, 40 );
insert into menu_item values ( 13, 7, 6, 40 );
insert into menu_item values ( 14, 7, 8, 80 );
