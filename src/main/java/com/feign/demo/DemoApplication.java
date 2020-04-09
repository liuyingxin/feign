package com.feign.demo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@MapperScan("com.feign.demo.*.mapper")
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableConfigurationProperties
@EnableSwagger2Doc
@EnableFeignClients
@EnableScheduling
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(DemoApplication.class)
                .main(DemoApplication.class)
                .run(args);
        context.registerShutdownHook();

        log.info("==================================");
        log.info("xinFinance Server startup");
        log.info("==================================");
        log.debug("==================================");
    }
}
