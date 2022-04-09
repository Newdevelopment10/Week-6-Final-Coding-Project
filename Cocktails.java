package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cocktails {
	
	private int cocktail_id;
	private String cocktail_name;
	private int spirits_id;

}
