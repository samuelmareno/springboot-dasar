package id.mareno.belajarspringdasar.listener;

import id.mareno.belajarspringdasar.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 26/04/22
 */
@Slf4j
@Component
public class UserListener {

    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("login success for user {}", event.getUser());
    }

    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event) {
        log.info("login success 2 for user {}", event.getUser());
    }

    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent event) {
        log.info("login success 3 for user {}", event.getUser());
    }
}
