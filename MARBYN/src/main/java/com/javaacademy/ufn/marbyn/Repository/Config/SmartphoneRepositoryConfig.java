package com.javaacademy.ufn.marbyn.Repository.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@EnableJpaRepositories(
        basePackages = "com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository",
        entityManagerFactoryRef = "smartphoneEntityManagerFactory",
        transactionManagerRef = "smartphoneTransactionManager"
)

@Configuration
public class SmartphoneRepositoryConfig {

    @Bean
    @ConfigurationProperties(prefix = "smartphone.repository")
    public DataSourceProperties smartphoneDataSourceProperties() {  return new DataSourceProperties();  }

    @Bean
    @Qualifier("smartphoneEntityManagerFactory")
    LocalContainerEntityManagerFactoryBean smartphoneEntityManagerFactory(){
        LocalContainerEntityManagerFactoryBean smartphoneemf = new LocalContainerEntityManagerFactoryBean();
        smartphoneemf.setDataSource(smartphoneDataSourceProperties().initializeDataSourceBuilder().build());
        smartphoneemf.setPackagesToScan("com.javaacademy.ufn.marbyn.model.smartphonemodel");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(true);
        vendorAdapter.setGenerateDdl(true);

        smartphoneemf.setJpaVendorAdapter(vendorAdapter);
        return smartphoneemf;
    }

    @Bean
    @Qualifier("smartphoneTransactionManager")
    public PlatformTransactionManager smartphoneTransactionManager() {
        JpaTransactionManager smartphonetransactionManager = new JpaTransactionManager();
        smartphonetransactionManager.setEntityManagerFactory(smartphoneEntityManagerFactory().getObject());

        return smartphonetransactionManager;
    }

}
