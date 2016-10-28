package com.tourfirm.web.config;


import java.util.Properties;

import javax.sql.DataSource;

import com.tourfirm.dao.impl.Impl;
import com.tourfirm.domain.Entities;
import com.tourfirm.service.CityService;
import com.tourfirm.service.ClientService;
import com.tourfirm.service.HotelService;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySources({
        @PropertySource("config/jdbc.properties"),
        @PropertySource("config/hibernate.properties")})
@ComponentScan(
        basePackageClasses = {  PersistenceConfig.class,
                                WebAppConfig.class,
                                WebAppInitializer.class,
                                Entities.class,
                                Impl.class,
                                CityService.class,
                                ClientService.class,
                                HotelService.class})
public class PersistenceConfig {

    @Autowired
    private Environment env;
    
    private String[] packages = {"com.tourfirm.domain"};
    
    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        ds.setUrl(env.getProperty("jdbc.url"));
        ds.setUsername(env.getProperty("jdbc.username"));
        ds.setPassword(env.getProperty("jdbc.password"));
        return ds;
    }
    
    @Bean(name = "sessionFactory")
    public LocalSessionFactoryBean sessionFactory(DataSource ds) {
        LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
        sf.setDataSource(ds);
        sf.setPackagesToScan(packages);
        sf.setHibernateProperties(getHibernateProperties());
        return sf;
    }
    
    private Properties getHibernateProperties() {
        Properties props = new Properties();
        props.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
        props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        return props;
    }
    
    @Bean
    public HibernateTransactionManager txManager(SessionFactory sf) {
        return new HibernateTransactionManager(sf);
    }
    
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslator() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
