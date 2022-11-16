package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.service.MerchantService;
import id.mareno.belajarspringdasar.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
public class InheritanceTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testInheritance() {
        MerchantService merchantService = context.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService, merchantServiceImpl);
    }
}
