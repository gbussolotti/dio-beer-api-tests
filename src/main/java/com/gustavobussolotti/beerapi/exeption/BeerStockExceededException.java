package com.gustavobussolotti.beerapi.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededException extends Exception {

    public BeerStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to increment informed exceeds the max stock capacity: %s", id, quantityToIncrement));
    }

    public BeerStockExceededException(Long id) {
        super(String.format("Stock of beer with %s ID is less than zero", id));
    }
}