package id.mareno.belajarspringdasar.service;

import id.mareno.belajarspringdasar.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Component
public class CustomerService {

    @Getter
    @Autowired
    @Qualifier(value = "normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired
    @Qualifier(value = "premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
