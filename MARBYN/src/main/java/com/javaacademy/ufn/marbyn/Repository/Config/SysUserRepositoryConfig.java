package com.javaacademy.ufn.marbyn.Repository.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(
        basePackages = "com.javaacademy.ufn.marbyn.Repository.Repository",
        entityManagerFactoryRef = "",
        transactionManagerRef = ""
)

@Configuration
public class SysUserRepositoryConfig {
}
