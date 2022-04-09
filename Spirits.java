package com.promineotech.drinks.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Spirits {
	
	private int spirits_id;
	private String spirits_name;
	private String category;

}
