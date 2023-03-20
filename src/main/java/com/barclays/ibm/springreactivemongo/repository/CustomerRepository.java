package com.barclays.ibm.springreactivemongo.repository;

import com.barclays.ibm.springreactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
