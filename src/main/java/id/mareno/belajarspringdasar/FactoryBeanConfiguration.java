package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Samuel Mareno
 * @Date 24/04/22
 */
@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryBeanConfiguration {
}
