package com.promineotech.drinks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;
import com.promineotech.drinks.entity.Ingredients;
import com.promineotech.drinks.entity.Spirits;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultDrinksSalesDao implements DrinksSalesDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Cocktails> fetchCocktails() {
		log.info("Dao:");
		
		 //String sql = "" + "SELECT * "  + "FROM cocktails " + "WHERE cocktail_id = :cocktail_id" 
		 //		 + " AND cocktail_name = :cocktail_name" + " AND spirits_id = : spirits_id";
		 
		 String sql = "" + "SELECT * "  + "FROM cocktails ";
		
		 return jdbcTemplate.query(sql, new RowMapper<>() {
	
	 @Override
     public Cocktails mapRow(ResultSet rs, int rowNum) throws SQLException {
       //formatter:off
       
       return Cocktails.builder()
           .cocktail_id(rs.getInt("cocktail_id"))
           .cocktail_name(rs.getString("cocktail_name"))
           .spirits_id(rs.getInt("spirits_id"))
           .build();
       //formatter:on
     }});
 }

	@Override
	public List<Ingredients> fetchIngredients() {
		log.info("Dao:");
		 
		 String sql = "" + "SELECT * "  + "FROM ingredients ";
		
		 return jdbcTemplate.query(sql, new RowMapper<>() {
	
	 @Override
    public Ingredients mapRow(ResultSet rs, int rowNum) throws SQLException {
      //formatter:off
      
      return Ingredients.builder()
          .ingredient_id(rs.getInt("ingredient_id"))
          .ingredient_name(rs.getString("ingredient_name"))
          .taste_profile(rs.getString("taste_profile"))
          .build();
      //formatter:on
    }});
	}

	@Override
	public List<Spirits> fetchSpirits() {
		log.info("Dao:");
		 
		 String sql = "" + "SELECT * "  + "FROM spirits ";
		
		 return jdbcTemplate.query(sql, new RowMapper<>() {
	
	 @Override
   public Spirits mapRow(ResultSet rs, int rowNum) throws SQLException {
     //formatter:off
     
     return Spirits.builder()
         .spirits_id(rs.getInt("spirits_id"))
         .spirits_name(rs.getString("spirits_name"))
         .category(rs.getString("category"))
         .build();
     //formatter:on
   }});
	}

//	@Override
//	public List<Drink_order> fetchDrinkOrder() {
//		log.info("Dao:");
//		 
//		 String sql = "" + "SELECT * "  + "FROM drink_order ";
//		
//		 return jdbcTemplate.query(sql, new RowMapper<>() {
//	
//	 @Override
//  public Drink_order mapRow(ResultSet rs, int rowNum) throws SQLException {
//    //formatter:off
//    
//    return Drink_order.builder()
//        .order_id(rs.getInt("order_id"))
//        .cocktail_id(rs.getInt("cocktail_id"))
//        .ingredient_id(rs.getInt("ingredient_id"))
//        .spirits_id(rs.getInt("spirits_id"))
//        .build();
//    //formatter:on
//  }});
//	}
	
}