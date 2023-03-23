create sequence meal_SEQ start with 1 increment by 50;
create sequence menu_item_SEQ start with 1 increment by 50;
create sequence menu_SEQ start with 1 increment by 50;
create sequence restaurant_SEQ start with 1 increment by 50;
create sequence users_SEQ start with 1 increment by 50;
create sequence vote_SEQ start with 1 increment by 50;

    create table meal (
       id integer not null,
        name varchar(255) not null,
        primary key (id)
    );

    create table menu (
       id integer not null,
        date date not null,
        restaurant_id integer not null,
        primary key (id)
    );

    create table menu_item (
       id integer not null,
        price float(53) not null,
        meal_id integer not null,
        menu_id integer not null,
        primary key (id)
    );

    create table restaurant (
       id integer not null,
        name varchar(255) not null,
        primary key (id)
    );

    create table user_role (
       user_id integer not null,
        role varchar(255) not null,
        primary key (user_id, role)
    );

    create table users (
       id integer not null,
        email varchar(200) not null,
        first_name varchar(100) not null,
        last_name varchar(200) not null,
        primary key (id)
    );

    create table vote (
       id integer not null,
        date date not null,
        restaurant_id integer not null,
        user_id integer not null,
        primary key (id)
    );

    alter table if exists menu 
       add constraint uc_menu_date_restaurant_id unique (date, restaurant_id);

    alter table if exists menu_item 
       add constraint UK_cvohgvqtuem3y734qoihsg504 unique (meal_id);

    alter table if exists menu_item 
       add constraint uc_menuitem_menu_id_meal_id unique (menu_id, meal_id);

    alter table if exists users 
       add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

    alter table if exists vote 
       add constraint UK_psgjh5ac2pf14u8y7rsvngjks unique (restaurant_id);

    alter table if exists vote 
       add constraint UK_dx2u8pwxfq611f6nsatwu44p0 unique (user_id);

    alter table if exists vote 
       add constraint uc_vote_user_id_date unique (user_id, date);

    alter table if exists menu 
       add constraint FKblwdtxevpl4mrds8a12q0ohu6 
       foreign key (restaurant_id) 
       references restaurant;

    alter table if exists menu_item 
       add constraint FKrp0kd9ati7l848h2xqalaawpd 
       foreign key (meal_id) 
       references meal;

    alter table if exists menu_item 
       add constraint FKcdkmv42yhn6udah6ug8rsymfl 
       foreign key (menu_id) 
       references menu;

    alter table if exists user_role 
       add constraint FKj345gk1bovqvfame88rcx7yyx 
       foreign key (user_id) 
       references users;

    alter table if exists vote 
       add constraint FK8cs2ixj0elmaw4psra8ht1mgb 
       foreign key (restaurant_id) 
       references restaurant;

    alter table if exists vote 
       add constraint FKkmvvqilx49120p47nr9t56omf 
       foreign key (user_id) 
       references users;
