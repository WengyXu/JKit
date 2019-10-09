package me.wengy.jkit.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

/**
 * Description: 引入SpringBoot相关注解.
 * @author Wengy
 * @since JDK 1.8
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
  
  /**
   *
   * @author Jon Doe
   */
  public EurekaApplication() {
    Logger.getLogger(this.getClass().getName());
  }

}
