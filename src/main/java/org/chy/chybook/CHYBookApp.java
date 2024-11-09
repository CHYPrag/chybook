package org.chy.chybook;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CHY
 * @since 2024-10-31
 */
@EnableMPP
@MapperScan(basePackages = {"org.chy.chybook.dao"})
@SpringBootApplication
public class CHYBookApp {
    public static void main(String[] args) {
        SpringApplication.run(CHYBookApp.class,args);
    }
}