package com.library.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author laifei
 * @date 2024/11/11 10:54
 */
@SpringBootApplication
@MapperScan(basePackages = "com.library.management.mapper")  // 扫描 Mapper 接口所在包
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
        System.out.println("Library Management System is running...");
    }
}
