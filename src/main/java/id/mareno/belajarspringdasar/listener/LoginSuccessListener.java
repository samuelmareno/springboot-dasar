package id.mareno.belajarspringdasar.listener;

import id.mareno.belajarspringdasar.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
@Slf4j
@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("login success for user {}", event.getUser());
    }
}
