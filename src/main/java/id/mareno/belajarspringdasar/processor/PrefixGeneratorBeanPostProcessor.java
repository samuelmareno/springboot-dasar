package id.mareno.belajarspringdasar.processor;

import id.mareno.belajarspringdasar.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
@Component
@Slf4j
public class PrefixGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("PrefixId generator processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            log.info("Prefix Set Id generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN-" + idAware.getId());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
