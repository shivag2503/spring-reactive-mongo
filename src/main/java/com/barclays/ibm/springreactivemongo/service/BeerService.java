package com.barclays.ibm.springreactivemongo.service;

import com.barclays.ibm.springreactivemongo.domain.Beer;
import com.barclays.ibm.springreactivemongo.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> getBeerById(String beerId);

    Flux<BeerDTO> listBeers();

    Mono<BeerDTO> updateExistingBeer(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeerById(String beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(String beerId);

    Mono<BeerDTO> findFirstByBeerName(String beerName);

    Flux<BeerDTO> findByBeerStyle(String beerStyle);
}
