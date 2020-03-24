package com.benjamin;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.benjamin")
@MapperScan(basePackages = "com.benjamin.mapper")
public class BenjaminMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BenjaminMybatisApplication.class, args);
    }

}
