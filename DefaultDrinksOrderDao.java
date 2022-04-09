package com.promineotech.drinks.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;

@Component
public class DefaultDrinksOrderDao implements DrinksOrderDao {

	@Autowired
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	private SqlParams generateInsertSql(Cocktails cocktail) {
		SqlParams params = new SqlParams();

		// @formatter:off
	    params.sql = ""
	        + "INSERT INTO cocktails ("
	        + "cocktail_id, cocktail_name, spirits_id"
	        + ") VALUES ("
	        + ":cocktail_id, :cocktail_name, :spirits_id"
	        + ")";
	    // @formatter:on

		params.source.addValue("cocktail_id", cocktail.getCocktail_id());
		params.source.addValue("cocktail_name", cocktail.getCocktail_name());
		params.source.addValue("spirits_id", cocktail.getSpirits_id());

		return params;
	}
	
	@Override
	public Cocktails createCocktail(Cocktails cocktail) {
		SqlParams params = generateInsertSql(cocktail);
		jdbcTemplate.update(params.sql, params.source);
		return Cocktails.builder()
				.cocktail_id(cocktail.getCocktail_id())
				.cocktail_name(cocktail.getCocktail_name())
				.spirits_id(cocktail.getSpirits_id())
				.build();
	}
		
	
	class SqlParams {
		String sql;
		MapSqlParameterSource source = new MapSqlParameterSource();
	}


	@Override
	public Cocktails updateCocktail(Cocktails cocktail) {
		SqlParams params = new SqlParams();
		
		// @formatter:off
	    params.sql = ""
	        + "UPDATE cocktails set "
	        + " cocktail_name = :cocktail_name "
	        + " WHERE cocktail_id = :cocktail_id";
	    // @formatter:on
	    
		params.source.addValue("cocktail_id", cocktail.getCocktail_id());
		params.source.addValue("cocktail_name", cocktail.getCocktail_name());
		jdbcTemplate.update(params.sql, params.source);
		return Cocktails.builder()
				.cocktail_id(cocktail.getCocktail_id())
				.cocktail_name(cocktail.getCocktail_name())
				.build();
	}

	@Override
	public Cocktails deleteCocktail(Cocktails cocktail) {
		SqlParams params = new SqlParams();
		
		// @formatter:off
	    params.sql = ""
	        + "DELETE FROM cocktails "
	        + " WHERE cocktail_id = :cocktail_id";
	    // @formatter:on

		params.source.addValue("cocktail_id", cocktail.getCocktail_id());
		jdbcTemplate.update(params.sql, params.source);
		return Cocktails.builder()
				.cocktail_id(cocktail.getCocktail_id())
				.build();
	}
	
//	private SqlParams generateInsertSql(Drink_order order) {
//		SqlParams params = new SqlParams();
//
//		// @formatter:off
//	    params.sql = ""
//	        + "INSERT INTO drink_order ("
//	        + "order_id, cocktail_id, ingredient_id, spirits_id"
//	        + ") VALUES ("
//	        + ":order_id, :cocktail_id, :ingredient_id, :spirits_id"
//	        + ")";
//	    // @formatter:on
//
//		params.source.addValue("order_id", order.getOrder_id());
//	    params.source.addValue("cocktail_id", order.getCocktail_id());
//		params.source.addValue("ingredient_id", order.getIngredient_id());
//		params.source.addValue("spirits_id", order.getSpirits_id());
//
//		return params;
//	}
//		
//	@Override
//	public Drink_order createDrinkOrder(Drink_order order) {
//		SqlParams params = generateInsertSql(order);
//		jdbcTemplate.update(params.sql, params.source);
//		return Drink_order.builder()
//				.order_id(order.getOrder_id())
//				.cocktail_id(order.getCocktail_id())
//				.ingredient_id(order.getIngredient_id())
//				.spirits_id(order.getSpirits_id())
//				.build();
//	}

//	@Override
//	public Drink_order updateDrinkOrder(Drink_order order) {
//		SqlParams params = new SqlParams();
//		
//		// @formatter:off
//	    params.sql = ""
//	        + "UPDATE drink_order set "
//	        + " cocktail_id = :cocktail_id "
//	        + " WHERE order_id = :order_id";
//	    // @formatter:on
//	    
//		params.source.addValue("cocktail_id", order.getCocktail_id());
//		params.source.addValue("order_id", order.getOrder_id());
//		jdbcTemplate.update(params.sql, params.source);
//		return Drink_order.builder()
//				.cocktail_id(order.getCocktail_id())
//				.order_id(order.getOrder_id())
//				.build();
//	}

//	@Override
//	public Drink_order deleteDrinkOrder(Drink_order order) {
//SqlParams params = new SqlParams();
//		
//		// @formatter:off
//	    params.sql = ""
//	        + "DELETE FROM drink_order "
//	        + " WHERE order_id = :order_id";
//	    // @formatter:on
//
//		params.source.addValue("order_id", order.getOrder_id());
//		jdbcTemplate.update(params.sql, params.source);
//		return Drink_order.builder()
//				.order_id(order.getOrder_id())
//				.build();
//	}
	
		
		
}
