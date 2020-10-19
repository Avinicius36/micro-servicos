package com.viniciusrocha.msscbrewery.web.service;

import com.viniciusrocha.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto createBeer(BeerDto beerDTO);

    void updateBeer(UUID beerId, BeerDto beerDTO);

    void deleteById(UUID beerId);
}
