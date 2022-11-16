package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
