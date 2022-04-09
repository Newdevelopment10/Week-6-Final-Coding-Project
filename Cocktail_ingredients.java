package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cocktail_ingredients {
	
	private int ingredient_id;
	private int cocktail_id;

}