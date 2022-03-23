package glg.springframework.msscbrewery.services;

import glg.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author godhanigopal
 */
public interface BeerService {
    /**
     * method used to get the beer using id
     * @param beerId id of the beer
     * @return BeerDto
     */
    public BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
