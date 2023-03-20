package com.barclays.ibm.springreactivemongo.mapper;

import com.barclays.ibm.springreactivemongo.domain.Beer;
import com.barclays.ibm.springreactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDTOToBeer(BeerDTO dto);

    BeerDTO beerToBeerDTO(Beer beer);
}
