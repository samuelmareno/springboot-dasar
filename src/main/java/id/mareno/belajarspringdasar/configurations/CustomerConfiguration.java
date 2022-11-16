package id.mareno.belajarspringdasar.configurations;

import id.mareno.belajarspringdasar.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Configuration
public class CustomerConfiguration {

    @Bean
    @Primary
    public CustomerRepository normalCustomerRepository() {
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }
}
