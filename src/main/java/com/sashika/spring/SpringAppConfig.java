package com.sashika.spring;

import com.sashika.CustomerDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.sashika")
public class SpringAppConfig {

    @Bean
    public CustomerDao getCustomerDao(){
        return new CustomerDao();
    }

}
