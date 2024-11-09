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

import static org.junit.jupiter.api.Assertions.*;

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
    public void select_book_from_user_shelf0(){

    }

    @Test
    public void selectBy() {
        Shelf shelf = new Shelf();
        shelf.setUid("–°¡¡");
        List<Shelf> books = shelfMapper.selectBy(shelf);
        Assertions.assertNotNull(books);
        Assertions.assertFalse(books.isEmpty());
        for (Shelf book : books) {
            Assertions.assertNotNull(book);
            Assertions.assertTrue(book.getBid().startsWith("b00"));
        }
    }
        @Test
        public void selectByMultiIds(){
            Map<String,Object> map=new HashMap<>();
            map.put("uid","–°¡¡");
            List<Shelf> books = shelfMapper.selectByMap(map);
            Assertions.assertNotNull(books);
            Assertions.assertFalse(books.isEmpty());
    }
}