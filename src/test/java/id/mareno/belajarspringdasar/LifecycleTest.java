package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Connection;
import id.mareno.belajarspringdasar.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 22/04/22
 */

public class LifecycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void testConnection() {
        Connection connection = context.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = context.getBean(Server.class);
    }
}
