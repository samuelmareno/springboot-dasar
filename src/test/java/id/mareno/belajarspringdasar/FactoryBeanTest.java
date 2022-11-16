package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 24/04/22
 */
public class FactoryBeanTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFactoryBean() {
        PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);
        Assertions.assertEquals("https://example.com", paymentGatewayClient.getEndpoint());
        Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());
        Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
    }
}
