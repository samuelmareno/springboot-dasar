package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Bar;
import id.mareno.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
public class ImportTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
    }

    @Test
    void testImport() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

    }
}
