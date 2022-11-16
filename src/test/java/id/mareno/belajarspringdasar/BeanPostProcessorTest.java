package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Car;
import id.mareno.belajarspringdasar.processor.IdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
public class BeanPostProcessorTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testBeanPostProcessor() {
        Car car = context.getBean(Car.class);
        System.out.println(car.getId());

        Assertions.assertNotNull(car.getId());
    }

    @Configuration
    @Import({
            IdGeneratorBeanPostProcessor.class,
            Car.class
    })
    public static class BeanPostProcessorConfiguration {

    }
}
