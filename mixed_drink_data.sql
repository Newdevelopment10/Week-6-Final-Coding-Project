-- Spirits
INSERT INTO spirits (spirits_id, spirits_name, category) VALUES('1', 'Patron', 'Tequila');
INSERT INTO spirits (spirits_id, spirits_name, category) VALUES('2', 'Patron', 'Tequila');
INSERT INTO spirits (spirits_id, spirits_name, category) VALUES('3', 'Woodford Reserve', 'Whiskey');
INSERT INTO spirits (spirits_id, spirits_name, category) VALUES('4', 'Sailor Jerry', 'Rum');

-- Ingredients
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('300', 'Pineapple Juice', 'Sweet');
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('301', 'Bitters', 'Herbal');
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('302', 'Lime Juice', 'Sour');
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('303', 'Light syrup', 'Sweet');
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('304', 'Ginger Beer', 'Sweet');
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('305', 'Orange', 'Citrus');
INSERT INTO ingredients (ingredient_id, ingredient_name, taste_profile) VALUES('306', 'Lime', 'Sour');

-- cocktails
INSERT INTO cocktails (cocktail_id, cocktail_name, spirits_id) VALUES('200', 'Margarita', '1');
INSERT INTO cocktails (cocktail_id, cocktail_name, spirits_id) VALUES('201', 'Mojito', '2');
INSERT INTO cocktails (cocktail_id, cocktail_name, spirits_id) VALUES('202', 'Old-fashioned', '3');
INSERT INTO cocktails (cocktail_id, cocktail_name, spirits_id) VALUES('203', 'Dark & Stormy', '4');

-- Cocktail_ingredients

