package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Bar;
import id.mareno.belajarspringdasar.data.Foo;
import id.mareno.belajarspringdasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 * @author Samuel Mareno
 * @Date 24/04/22
 */
@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
