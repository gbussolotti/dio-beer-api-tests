package com.gustavobussolotti.beerapi.builder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gustavobussolotti.beerapi.dto.BeerDTO;
import com.gustavobussolotti.beerapi.enums.BeerType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Skol";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 30;

    @Builder.Default
    private int quantity = 15;

    @Builder.Default
    private BeerType type = BeerType.PILSEN;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}