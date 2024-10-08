package com.wilson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ai-interview
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AIInterviewApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(AIInterviewApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  AI 面试官   ლ(´ڡ`ლ)ﾞ ");
    }
}
