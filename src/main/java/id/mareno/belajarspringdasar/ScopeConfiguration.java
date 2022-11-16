package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Bar;
import id.mareno.belajarspringdasar.data.Foo;
import id.mareno.belajarspringdasar.scope.DoubletonScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Samuel Mareno
 * @Date 22/04/22
 */
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        System.out.println("Creating new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        System.out.println("Creating bar");
        return new Bar();
    }
}
