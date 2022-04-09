package com.promineotech.drinks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.drinks.dao.DrinksOrderDao;
import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;

@Service
public class DefaultDrinksOrderService implements DrinksOrderService {

	@Autowired
	private DrinksOrderDao drinksOrderDao; 
	
	@Override
	public Cocktails createCocktail(Cocktails cocktail) {
		return drinksOrderDao.createCocktail(cocktail);
	}

	@Override
	public Cocktails updateCocktail(Cocktails cocktail) {
		return drinksOrderDao.updateCocktail(cocktail);
	}

	@Override
	public Cocktails deleteCocktail(Cocktails cocktail) {
		return drinksOrderDao.deleteCocktail(cocktail);
	}

//	@Override
//	public Drink_order createDrinkOrder(Drink_order order) {
//		return drinksOrderDao.createDrinkOrder(order);
//	}
//
//	@Override
//	public Drink_order updateDrinkOrder(Drink_order order) {
//		return drinksOrderDao.updateDrinkOrder(order);
//	}
//
//	@Override
//	public Drink_order deleteDrinkOrder(Drink_order order) {
//		return drinksOrderDao.deleteDrinkOrder(order);
//	}

}
