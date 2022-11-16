package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Samuel Mareno
 * @Date 21/04/22
 */
@Configuration
public class PrimaryConfiguration {

    @Primary
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
