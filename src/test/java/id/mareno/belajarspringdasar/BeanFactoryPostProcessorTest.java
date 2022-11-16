package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Foo;
import id.mareno.belajarspringdasar.processor.FooBeanFactoryPostProcessor;
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
public class BeanFactoryPostProcessorTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testBeanFactoryPostProcessorTest() {
        Foo foo = context.getBean(Foo.class);
        Assertions.assertNotNull(foo);
    }

    @Configuration
    @Import(FooBeanFactoryPostProcessor.class)
    public static class TestConfiguration {

    }
}
