package com.javaacademy.ufn.marbyn.Repository.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@EnableJpaRepositories(
        basePackages = "com.javaacademy.ufn.marbyn.Repository.UserProfileRepository",
        entityManagerFactoryRef = "userprofileEntityManagerFactory",
        transactionManagerRef = "userprofileTransactionManager"
)

@Configuration
public class UserProfileRepositoryConfig {

    @Bean
    @Qualifier("userprofileDataSourceProperties")
    @ConfigurationProperties(prefix = "user.profile.repository")
    public DataSourceProperties userprofileDataSourceProperties() {  return new DataSourceProperties();  }

    @Bean
    @Qualifier("userprofileEntityManagerFactory")
    LocalContainerEntityManagerFactoryBean userprofileEntityManagerFactory(){
        LocalContainerEntityManagerFactoryBean userprofileemf = new LocalContainerEntityManagerFactoryBean();
        userprofileemf.setDataSource(userprofileDataSourceProperties().initializeDataSourceBuilder().build());
        userprofileemf.setPackagesToScan
                ("com.javaacademy.ufn.marbyn.model.smartphonemodel",
                        "com.javaacademy.ufn.marbyn.model.sysusermodel");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(true);
        vendorAdapter.setGenerateDdl(true);

        userprofileemf.setJpaVendorAdapter(vendorAdapter);
        return userprofileemf;
    }

    @Bean
    @Qualifier("userprofileTransactionManager")
    public PlatformTransactionManager userprofileTransactionManager() {
        JpaTransactionManager userprofiletransactionManager = new JpaTransactionManager();
        userprofiletransactionManager.setEntityManagerFactory(userprofileEntityManagerFactory().getObject());

        return userprofiletransactionManager;
    }

}
