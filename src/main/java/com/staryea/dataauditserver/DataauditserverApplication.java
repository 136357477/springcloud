package com.staryea.dataauditserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.staryea.dataauditserver")
@EnableTransactionManagement
public class DataauditserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataauditserverApplication.class, args);
    }

}
