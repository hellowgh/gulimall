package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置mybatis-plus流程
 *
 * 1、使用mapperScan扫描dao
 * 2、告诉mybatis-plus映射文件位置（在配置文件中配置）
 */

@MapperScan("com/atguigu/gulimall/product/dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
