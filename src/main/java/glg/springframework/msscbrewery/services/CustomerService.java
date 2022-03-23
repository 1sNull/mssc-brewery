package glg.springframework.msscbrewery.services;

import glg.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author godhanigopal
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
