package com.gustavobussolotti.beerapi.repository;

import com.gustavobussolotti.beerapi.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName( String name);
}
