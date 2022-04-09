package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ingredients {
	
	private int ingredient_id;
	private String ingredient_name;
	private String taste_profile;

}
