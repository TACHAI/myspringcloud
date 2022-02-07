package com.laishishui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h1>监控中心服务器入口</h1>
 * @author tachai on 2022/2/7 9:24 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
