package me.wengy.jkit.eureka;

import org.springframework.boot.SpringApplication;

/**
 * Description: Eureka注册中心启动类.
 *
 * @author Wengy
 * @since JDK 1.8
 * @since 1.0.0
 */
public final class EurekaStarter {
  
  private EurekaStarter() {}
  
  /**
   * Description: 启动入口.
   *
   * @author Wengy
   * @param args should be not null
   */
  public static void main(final String[] args) {
    SpringApplication.run(EurekaApplication.class, args);
  }
}
