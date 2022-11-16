package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.cyclic.CyclicA;
import id.mareno.belajarspringdasar.data.cyclic.CyclicB;
import id.mareno.belajarspringdasar.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Samuel Mareno
 * @Date 21/04/22
 */

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
