package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.listener.LoginAgainSuccessListener;
import id.mareno.belajarspringdasar.listener.LoginSuccessListener;
import id.mareno.belajarspringdasar.listener.UserListener;
import id.mareno.belajarspringdasar.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Samuel Mareno
 * @Date 25/04/22
 */
public class PublishEventTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testPublishEvent() {
        UserService userService = applicationContext.getBean(UserService.class);

        Assertions.assertTrue(userService.login("reno", "reno"));
        Assertions.assertFalse(userService.login("salah", "reno"));
    }

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguration {

    }
}
