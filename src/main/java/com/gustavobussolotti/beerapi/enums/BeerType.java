package com.gustavobussolotti.beerapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    LAGER("Lager"),
    MALZEBIER("Malzebier"),
    PILSEN("Pilsen"),
    IPA("IPA"),
    REDLAGER("RedLager"),
    WEISS("Weiss"),
    WIT("WitBeer");

    private final String descriptionType;
}
