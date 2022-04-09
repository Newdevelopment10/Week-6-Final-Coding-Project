package com.promineotech.drinks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.drinks.entity.Cocktails;
import com.promineotech.drinks.entity.Drink_order;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@Validated
@RequestMapping("/Create-mixed-drink")
@OpenAPIDefinition(info = @Info(title = "Drinks Sales Service"), servers = {
	    @Server(url = "http://localhost:8080", description = "Local server.")})

public interface DrinksOrderController {

	@Operation(summary = "Create a Cocktail",
		      description = " Create a Cocktail given customer order",
		      responses = {
		          @ApiResponse(responseCode = "201", description = "A Cocktail is created",
		              content = @Content(mediaType = "application/json",
		                  schema = @Schema(implementation = Cocktails.class))),
		          @ApiResponse(responseCode = "400", description = "The drink order is invalid",
		              content = @Content(mediaType = "application/json")),
		          @ApiResponse(responseCode = "500", description = "An unplanned error occurred.",
		              content = @Content(mediaType = "application/json")),}
		      )
	
//	@Operation(summary = "Create a drink order",
//    description = " Create a drink order given customer request",
//    responses = {
//        @ApiResponse(responseCode = "201", description = "An order is created",
//            content = @Content(mediaType = "application/json",
//                schema = @Schema(implementation = Drink_order.class))),
//        @ApiResponse(responseCode = "400", description = "The drink order is invalid",
//            content = @Content(mediaType = "application/json")),
//        @ApiResponse(responseCode = "500", description = "An unplanned error occurred.",
//            content = @Content(mediaType = "application/json")),}
//    )
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Cocktails createCocktail(@RequestBody Cocktails cocktail);
	//Drink_order createDrinkOrder(@RequestBody Drink_order order);
	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	Cocktails updateCocktail(Cocktails cocktail);
	//Drink_order updateDrinkOrder(@RequestBody Drink_order order);
	@DeleteMapping
	@ResponseStatus(code = HttpStatus.OK)
	Cocktails deleteCocktail(@RequestBody Cocktails cocktail);
	//Drink_order deleteteDrinkOrder(@RequestBody Drink_order order);
	

// Tried this method of sending mapping to my localhost; also tried approach above and neither allowed my app to start	

//	@PostMapping
//	@ResponseStatus(code = HttpStatus.CREATED)
//	Drink_order createDrinkOrder(@RequestBody Drink_order order);
//	@PutMapping
//	@ResponseStatus(code = HttpStatus.OK)
//	Drink_order updateDrinkOrder(@RequestBody Drink_order order);
//	@DeleteMapping
//	@ResponseStatus(code = HttpStatus.OK)
//	Drink_order deleteteDrinkOrder(@RequestBody Drink_order order);
}

