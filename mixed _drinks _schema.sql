DROP table if exists cocktail_ingredients;
DROP table if exists drink_order;
DROP table if exists cocktails;
DROP table if exists ingredients;
DROP table if exists spirits;

CREATE table spirits (
spirits_id int not null auto_increment,
spirits_name varchar(40) not null,
category varchar(40) not null,
PRIMARY KEY (spirits_id)
);

CREATE table ingredients (
ingredient_id int not null auto_increment,
ingredient_name varchar(40) not null,
taste_profile varchar(40) not null,
PRIMARY KEY (ingredient_id)
);

CREATE table cocktails (
cocktail_id int not null auto_increment,
cocktail_name varchar(40),
spirits_id int not null,
PRIMARY KEY (cocktail_id),
FOREIGN KEY (spirits_id) references spirits (spirits_id),
);

CREATE table cocktail_ingredients (
recipe_id int not null auto_increment,
cocktail_id int not null,
ingredient_id int not null,
PRIMARY KEY (recipe_id),
FOREIGN KEY (cocktail_id) references cocktails (cocktail_id),
FOREIGN KEY (ingredient_id) references ingredients (ingredient_id),
);

CREATE table drink_order (
order_id int not null auto_increment,
cocktail_id int not null,
ingredient_id int not null,
spirits_id int not null,
PRIMARY KEY (order_id),
FOREIGN KEY (cocktail_id) references cocktails (cocktail_id),
FOREIGN KEY (ingredient_id) references ingredients (ingredient_id),
FOREIGN KEY (spirits_id) references spirits (spirits_id)
);
