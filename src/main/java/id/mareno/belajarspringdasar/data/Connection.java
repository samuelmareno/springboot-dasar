package id.mareno.belajarspringdasar.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Samuel Mareno
 * @Date 22/04/22
 */
@Slf4j
public class Connection implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("connection is ready to be used");
    }

    @Override
    public void destroy() throws Exception {
        log.info("connection is destroyed");
    }
}
