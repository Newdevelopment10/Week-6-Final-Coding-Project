package com.promineotech.drinks.dao;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;

public interface DrinksOrderDao {

	Cocktails createCocktail(Cocktails cocktail);

	Cocktails updateCocktail(Cocktails cocktail);

	Cocktails deleteCocktail(Cocktails cocktail);

//	Drink_order createDrinkOrder(Drink_order order);
//
//	Drink_order updateDrinkOrder(Drink_order order);
//
//	Drink_order deleteDrinkOrder(Drink_order order);

}
