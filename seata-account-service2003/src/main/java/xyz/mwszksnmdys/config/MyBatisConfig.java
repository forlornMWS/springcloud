package xyz.mwszksnmdys.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"xyz.mwszksnmdys.dao"})
public class MyBatisConfig {

}

