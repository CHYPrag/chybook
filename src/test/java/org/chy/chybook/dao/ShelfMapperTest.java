package org.chy.chybook.dao;

import org.chy.chybook.entity.Shelf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


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
    @Test
    public void selectById(){
        Shelf shelf = new Shelf();
        shelf.setUid("–°¡¡");
        shelf.setBid("b001");
        Shelf book = shelfMapper.selectByMultiId(shelf);
        Assertions.assertNotNull(book);
        System.out.println(book);
    }

}