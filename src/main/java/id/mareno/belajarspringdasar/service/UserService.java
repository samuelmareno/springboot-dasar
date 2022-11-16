package id.mareno.belajarspringdasar.service;

import id.mareno.belajarspringdasar.data.User;
import id.mareno.belajarspringdasar.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if (isLoginSuccessful(username, password)) {
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            return false;
        }
    }

    private boolean isLoginSuccessful(String username, String password) {
        return username.equals("reno") && password.equals("reno");
    }
}
