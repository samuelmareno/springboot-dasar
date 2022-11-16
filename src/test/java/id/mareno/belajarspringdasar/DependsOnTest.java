package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 21/04/22
 */
public class DependsOnTest {

    private ApplicationContext context;


    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        Foo foo = context.getBean(Foo.class);
    }
}
