package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Samuel Mareno
 * @Date 20/04/22
 */
@Configuration
public class DuplicateConfiguration {

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
