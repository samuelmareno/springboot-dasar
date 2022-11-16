package id.mareno.belajarspringdasar.event;

import id.mareno.belajarspringdasar.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
