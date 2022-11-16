package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Configuration
@ComponentScan(value = {
        "id.mareno.belajarspringdasar.repository",
        "id.mareno.belajarspringdasar.service",
        "id.mareno.belajarspringdasar.configurations",
})
@Import(value = MultiFoo.class)
public class ComponentConfiguration {
}
