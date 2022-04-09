package com.promineotech.drinks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.drinks.dao.DrinksSalesDao;
import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;
//import com.promineotech.drinks.entity.Drink_order;
import com.promineotech.drinks.entity.Ingredients;
import com.promineotech.drinks.entity.Spirits;
//service layer called business logic
//Can use short-writing to filter and modify code for internal use
@Service
public class DefaultDrinksSalesService implements DrinksSalesService {

	@Autowired
	private DrinksSalesDao drinksSalesDao;
	
	@Override
	public List<Cocktails> fetchCocktails() {
		return drinksSalesDao.fetchCocktails();
	}

	@Override
	public List<Ingredients> fetchIngredients() {
		return drinksSalesDao.fetchIngredients();
	}

	@Override
	public List<Spirits> fetchSpirits() {
		return drinksSalesDao.fetchSpirits();
	}

//	@Override
//	public List<Drink_order> fetchDrinkOrder() {
//		return drinksSalesDao.fetchDrinkOrder();
//	}

}
