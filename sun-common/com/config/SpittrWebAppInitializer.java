package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.io.File;


/**
 * ${DESCRIPTION}
 * ServletContainerInitializer(servlet3.0)
 * SpringServletContainerInitializer
 * 扩展AbstractAnnotationConfigDispatcherServletInitializer servlet3.0
 * @author sunjie
 * @create 2018-09-12 9:44
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 配置ContextLoaderListener(业务Bean)
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 配置DispatcherServlet
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new FilterConfig()};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        new MultipartConfigElement("F:"+ File.separatorChar +"tmp"+File.separatorChar+"uploads");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }
}
