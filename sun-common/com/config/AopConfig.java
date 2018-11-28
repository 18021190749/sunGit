package com.config;

import com.spittr.util.Aop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-13 20:39
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com")
public class AopConfig {
    @Bean
    public Aop aop(){
        return new Aop();
    }
}
