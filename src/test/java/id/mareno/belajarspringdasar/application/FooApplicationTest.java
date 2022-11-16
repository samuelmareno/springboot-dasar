package id.mareno.belajarspringdasar.application;

import id.mareno.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Samuel Mareno
 * @Date 26/04/22
 */
@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testFoo() {
        Assertions.assertNotNull(foo);
    }
}