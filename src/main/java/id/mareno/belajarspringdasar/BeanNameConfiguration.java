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
public class BeanNameConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }
}
