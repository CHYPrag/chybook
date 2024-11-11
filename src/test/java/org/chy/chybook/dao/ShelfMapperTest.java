package org.chy.chybook.dao;

import org.chy.chybook.entity.Shelf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest
class ShelfMapperTest {

    @Autowired
    private ShelfMapper shelfMapper;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    /*
    注意编码问题
     */
    @Test
    public void selectById(){
        Shelf shelf = new Shelf();
        shelf.setUid("小亮");
        shelf.setBid("b001");
        Shelf book = shelfMapper.selectByMultiId(shelf);
        Assertions.assertNotNull(book);
        System.out.println(book);
    }

    @Test
    public void selectByMap(){
        Map<String,Object> map=new HashMap<>();
        map.put("uid","小亮");
        List<Shelf> books = shelfMapper.selectByMap(map);
        Assertions.assertNotNull(books);
        Assertions.assertFalse(books.isEmpty());
        for (Shelf book : books) {
            Assertions.assertNotNull(book);
            Assertions.assertEquals(book.getUid(),"小亮");
            System.out.println(book);
        }
    }

}