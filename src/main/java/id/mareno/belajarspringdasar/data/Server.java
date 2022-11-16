package id.mareno.belajarspringdasar.data;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Samuel Mareno
 * @Date 22/04/22
 */
@Slf4j
public class Server {

    @PostConstruct
    void start() {
        log.info("Starting the server");
    }

    @PreDestroy
    void stop() {
        log.info("Stopping the server");
    }
}
