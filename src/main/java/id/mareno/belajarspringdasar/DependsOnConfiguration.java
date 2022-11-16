package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Bar;
import id.mareno.belajarspringdasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 * @author Samuel Mareno
 * @Date 21/04/22
 */
@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn(
            {"bar"}
    )
    public Foo foo() {
        log.debug("Creating foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.debug("Creating bar");
        return new Bar();
    }
}
