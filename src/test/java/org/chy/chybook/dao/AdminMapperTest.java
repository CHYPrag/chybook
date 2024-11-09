package org.chy.chybook.dao;

import org.chy.chybook.entity.Admin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminMapperTest {

    @Autowired
    private AdminMapper adminMapper;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void selectAdminById(){
        Admin admin = adminMapper.selectById("100");
        Assertions.assertNotNull(admin);
        Assertions.assertEquals(admin.getId(),"100");
        Assertions.assertEquals(admin.getPassword(),"000000");
    }

}