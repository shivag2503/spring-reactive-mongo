package com.barclays.ibm.springreactivemongo.mapper;

import com.barclays.ibm.springreactivemongo.domain.Customer;
import com.barclays.ibm.springreactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDTOToCustomer(CustomerDTO customerDTO);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
