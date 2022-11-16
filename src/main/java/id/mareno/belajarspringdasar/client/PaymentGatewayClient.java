package id.mareno.belajarspringdasar.client;

import lombok.Data;

/**
 * @author Samuel Mareno
 * @Date 24/04/22
 */
@Data
public class PaymentGatewayClient {

    private String endpoint;

    private String publicKey;

    private String privateKey;
}
