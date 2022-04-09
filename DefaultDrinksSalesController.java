package com.promineotech.drinks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;
import com.promineotech.drinks.entity.Ingredients;
import com.promineotech.drinks.entity.Spirits;
import com.promineotech.drinks.service.DrinksSalesService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultDrinksSalesController implements DrinksSalesController {
	
	@Autowired
	  private DrinksSalesService drinksSalesService;
	  
	@Override
	  
	  public List<Cocktails> fetchCocktails() {
	    log.info("Controller:");
	    return drinksSalesService.fetchCocktails();
	  }

	@Override
	public List<Ingredients> fetchIngredients() {
		log.info("Controller:");
	    return drinksSalesService.fetchIngredients();
	}

	@Override
	public List<Spirits> fetchSpirits() {
		log.info("Controller:");
	    return drinksSalesService.fetchSpirits();
	}
	
	@Override
	public List<Drink_order> fetchDrinkOrder() {
		log.info("Controller:");
	    return drinksSalesService.fetchDrinkOrder();
	}

}
