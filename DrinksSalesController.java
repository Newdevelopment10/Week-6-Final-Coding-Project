package com.promineotech.drinks.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;
import com.promineotech.drinks.entity.Ingredients;
import com.promineotech.drinks.entity.Spirits;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@RequestMapping("/Customer-Request")
@OpenAPIDefinition(info = @Info(title = "Drinks Sales Service"), servers = {
	    @Server(url = "http://localhost:8080", description = "Local server.")})

public interface DrinksSalesController {
	//@formatter: off
	  @Operation(summary = "Return a list of Cocktails",
	      description = "Return a list of Cocktails given customer order",
	      responses = {
	          @ApiResponse(responseCode = "200", description = "A list of Cocktails is returned",
	              content = @Content(mediaType = "application/json",
	                  schema = @Schema(implementation = Cocktails.class))),
	          @ApiResponse(responseCode = "400", description = "The request parameters are invalid",
	              content = @Content(mediaType = "application/json")),
	          @ApiResponse(responseCode = "404",
	              description = "No Cocktails were found with the input criteria",
	              content = @Content(mediaType = "application/json")),
	          @ApiResponse(responseCode = "500", description = "An unplanned error occurred.",
	              content = @Content(mediaType = "application/json")),}
	      )
	  @GetMapping
	  @ResponseStatus(value = HttpStatus.OK)
	  List<Cocktails> fetchCocktails();
	  
	  @GetMapping("/ingredients")
	  @ResponseStatus(value = HttpStatus.OK)
	  List<Ingredients> fetchIngredients();
	  
	  @GetMapping("/spirits")
	  @ResponseStatus(value = HttpStatus.OK)
	  List<Spirits> fetchSpirits();
	  
	  @GetMapping("/drink order")
	  @ResponseStatus(value = HttpStatus.OK)
	  List<Drink_order> fetchDrinkOrder();

	  //formatter:on

}
