package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-12 9:47
 */
@Configuration
@ComponentScan(basePackages = {"com"},
        excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}
