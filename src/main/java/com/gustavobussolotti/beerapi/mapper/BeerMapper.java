package com.gustavobussolotti.beerapi.mapper;


import com.gustavobussolotti.beerapi.dto.BeerDTO;
import com.gustavobussolotti.beerapi.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}