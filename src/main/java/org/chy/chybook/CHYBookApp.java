package org.chy.chybook;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.chy.chybook.dao.ShelfMapper;
import org.chy.chybook.entity.Shelf;
import org.junit.jupiter.api.Assertions;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author CHY
 * @since 2024-10-31
 */
@EnableMPP
@MapperScan(basePackages = {"org.chy.chybook.dao"})
@SpringBootApplication
public class CHYBookApp {

    public static void test(ShelfMapper shelfMapper){
        Shelf shelf = new Shelf();
        shelf.setUid("小亮");
        shelf.setBid("b001");
        Shelf book = shelfMapper.selectByMultiId(shelf);
        Assertions.assertNotNull(book);
        System.out.println(book);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(CHYBookApp.class, args);
        ShelfMapper shelfMapper = ioc.getBean(ShelfMapper.class);

        test(shelfMapper);

    }
}