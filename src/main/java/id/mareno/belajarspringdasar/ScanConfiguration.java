package id.mareno.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Configuration
@ComponentScan(
        basePackages = {
                "id.mareno.belajarspringdasar.configurations"
        }
)
public class ScanConfiguration {
}
