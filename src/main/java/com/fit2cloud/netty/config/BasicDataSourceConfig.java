package com.fit2cloud.netty.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(basePackages = "com.fit2cloud.netty.dao", sqlSessionFactoryRef = "sqlSessionFactory")
@EnableTransactionManagement
public class BasicDataSourceConfig {

}
