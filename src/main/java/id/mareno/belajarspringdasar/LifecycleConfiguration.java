package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.Connection;
import id.mareno.belajarspringdasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Samuel Mareno
 * @Date 22/04/22
 */
@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }
}
