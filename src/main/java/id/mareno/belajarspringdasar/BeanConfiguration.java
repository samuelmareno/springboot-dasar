package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Samuel Mareno
 * @Date 20/04/22
 */
@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.debug("creating new foo");
        return foo;
    }
}
