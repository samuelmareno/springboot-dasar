package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Car;
import id.mareno.belajarspringdasar.processor.IdGeneratorBeanPostProcessor;
import id.mareno.belajarspringdasar.processor.PrefixGeneratorBeanPostProcessor;
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
public class OrderedTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testOrdered() {
        Car car = context.getBean(Car.class);
        System.out.println(car.getId());

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("PZN-"));
    }

    @Configuration
    @Import({
            Car.class,
            PrefixGeneratorBeanPostProcessor.class,
            IdGeneratorBeanPostProcessor.class
    })
    public static class TestConfiguration {

    }
}
