create table categories (
    id          bigserial primary key,
    title       varchar(255)
);

create table products (
    id          bigserial primary key,
    title       varchar(255),
    price       numeric(8, 2),
    category_id bigint references categories (id)
);

insert into categories (title) values
('Food'),
('Electronic');

insert into products (title, price, category_id) values
('Bread', 32.00, 1),
('Milk', 120.00, 1),
('Butter', 320.00, 1),
('Cheese', 500.00, 1);

