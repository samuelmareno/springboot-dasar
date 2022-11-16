package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 21/04/22
 */
public class DuplicateBeanTest {

    @Test
    void duplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo bean = context.getBean(Foo.class);
        });
    }

    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
