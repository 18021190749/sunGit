package com.config;

import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.annotation.WebFilter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-13 19:07
 */
@WebFilter(filterName = "characterEncodingFilter",urlPatterns = "/*")
public class FilterConfig extends CharacterEncodingFilter {
    public FilterConfig() {
        super("UTF-8", true);
    }
}
