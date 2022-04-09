package com.promineotech.drinks.service;

import java.util.List;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;
import com.promineotech.drinks.entity.Ingredients;
import com.promineotech.drinks.entity.Spirits;

public interface DrinksSalesService {

	List<Cocktails> fetchCocktails();

	List<Ingredients> fetchIngredients();

	List<Spirits> fetchSpirits();

	List<Drink_order> fetchDrinkOrder();


}
