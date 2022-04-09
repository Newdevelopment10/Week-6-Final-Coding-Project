package com.promineotech.drinks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;
import com.promineotech.drinks.service.DrinksOrderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultDrinksOrderController implements DrinksOrderController {
	
	@Autowired
	private DrinksOrderService drinksOrderService;

	@Override
	public Cocktails createCocktail(Cocktails cocktail) {
		log.info("Controller:");
		return drinksOrderService.createCocktail(cocktail);
	}
	
	@Override
	public Cocktails updateCocktail(Cocktails cocktail) {
		log.info("Controller:");
		return drinksOrderService.updateCocktail(cocktail);
	}
	@Override
	public Cocktails deleteCocktail(Cocktails cocktail) {
		log.info("Controller:");
		return drinksOrderService.deleteCocktail(cocktail);
	}

//	@Override
//	public Drink_order createDrinkOrder(Drink_order order) {
//		log.info("Controller:");
//		return drinksOrderService.createDrinkOrder(order);
//	}
//
//	@Override
//	public Drink_order updateDrinkOrder(Drink_order order) {
//		log.info("Controller:");
//		return drinksOrderService.updateDrinkOrder(order);
//	}
//
//	@Override
//	public Drink_order deleteteDrinkOrder(Drink_order order) {
//		log.info("Controller:");
//		return drinksOrderService.deleteDrinkOrder(order);
//	}
	
}
