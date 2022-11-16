package id.mareno.belajarspringdasar.service;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
@Component
public class AuthService implements ApplicationContextAware, BeanNameAware {

    @Getter
    private String beanName;

    @Getter
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
