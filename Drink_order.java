package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Drink_order {
	
	private int order_id;
	private int cocktail_id;
	private int ingredient_id;
	private int spirits_id;

}
