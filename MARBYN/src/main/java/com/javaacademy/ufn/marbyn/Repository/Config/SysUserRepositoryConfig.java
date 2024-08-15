package com.javaacademy.ufn.marbyn.Repository.Config;

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
        basePackages = "com.javaacademy.ufn.marbyn.Repository.SysUserRepository",
        entityManagerFactoryRef = "sysuserEntityManagerFactory",
        transactionManagerRef = "sysuserTransactionManager"
)

@Configuration
public class SysUserRepositoryConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "sys.user.repository")
    public DataSourceProperties sysuserDataSourceProperties() {  return new DataSourceProperties();  }

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean sysuserEntityManagerFactory(){
        LocalContainerEntityManagerFactoryBean sysuseremf = new LocalContainerEntityManagerFactoryBean();
        sysuseremf.setDataSource(sysuserDataSourceProperties().initializeDataSourceBuilder().build());
        sysuseremf.setPackagesToScan
                ("com.javaacademy.ufn.marbyn.model.smartphonemodel",
                        "com.javaacademy.ufn.marbyn.model.sysusermodel");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(true);
        vendorAdapter.setGenerateDdl(true);

        sysuseremf.setJpaVendorAdapter(vendorAdapter);
        return sysuseremf;
    }

    @Bean
    @Primary
    public PlatformTransactionManager sysuserTransactionManager() {
        JpaTransactionManager sysusertransactionManager = new JpaTransactionManager();
        sysusertransactionManager.setEntityManagerFactory(sysuserEntityManagerFactory().getObject());

        return sysusertransactionManager;
    }

}
