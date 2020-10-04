package com.baoge.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.baoge.alibaba.dao"})
public class MyBatisConfig {
}

