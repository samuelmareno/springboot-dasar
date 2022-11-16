package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.configurations.BarConfiguration;
import id.mareno.belajarspringdasar.configurations.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
