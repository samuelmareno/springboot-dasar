package id.mareno.belajarspringdasar.factory;

import id.mareno.belajarspringdasar.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 24/04/22
 */
@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://example.com");
        client.setPublicKey("public");
        client.setPrivateKey("private");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
