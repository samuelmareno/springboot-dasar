package id.mareno.belajarspringdasar.application;

import id.mareno.belajarspringdasar.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author Samuel Mareno
 * @Date 26/04/22
 */
@SpringBootApplication
public class FooApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
        System.out.println(applicationContext.getBean(Foo.class));
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
