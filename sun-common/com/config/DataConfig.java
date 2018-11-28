package com.sun;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-10-17 10:48
 */
@Configuration
public class DataConfig {
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        druidDataSource.setUrl("jdbc\\:oracle\\:thin\\:@localhost\\:1521\\:acc");
        druidDataSource.setUsername("sunjie");
        druidDataSource.setPassword("123456");
        druidDataSource.setInitialSize(10);
        druidDataSource.setMaxActive(20);
        return druidDataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setPackagesToScan(new String[]{"com.sun.ormMappings"});
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
        bean.setHibernateProperties(properties);
        return bean;
    }
}
