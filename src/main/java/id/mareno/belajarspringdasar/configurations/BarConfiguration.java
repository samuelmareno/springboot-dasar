package id.mareno.belajarspringdasar.configurations;

import id.mareno.belajarspringdasar.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Samuel Mareno
 * @Date 22/04/22
 */
@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}
