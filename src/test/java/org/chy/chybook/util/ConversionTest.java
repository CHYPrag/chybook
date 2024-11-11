package org.chy.chybook.util;

import org.chy.chybook.entity.Shelf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void mapToObject1() throws InstantiationException, IllegalAccessException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid","Tom");
        map.put("bid","b003");
        map.put("regardless-property",123456);
        map.put("null-val",null);
        Shelf shelf = Conversion.MapToObject(map, Shelf.class);
        Assertions.assertNotNull(shelf);
        Assertions.assertEquals(shelf.getBid(),"b003");
        Assertions.assertEquals(shelf.getUid(),"Tom");
    }

    @Test
    public void mapToObject2() throws InstantiationException, IllegalAccessException {
        HashMap<String, Object> map = new HashMap<>();
        Shelf shelf = Conversion.MapToObject(map, Shelf.class);
        Assertions.assertNotNull(shelf);
    }

    @Test
    void objectToMap1() throws IllegalAccessException {
        Shelf shelf = new Shelf();
        Map<String, Object> map = Conversion.ObjectToMap(shelf, Shelf.class);
        Assertions.assertTrue(map.get("uid") == null);
        Assertions.assertTrue(map.get("bid") == null);
    }

    @Test
    void objectToMap2() throws IllegalAccessException {
        Shelf shelf = new Shelf();
        shelf.setBid("b003");
        shelf.setUid("Tom");
        Map<String, Object> map = Conversion.ObjectToMap(shelf, Shelf.class);
        Assertions.assertTrue(map.get("uid") == "Tom");
        Assertions.assertTrue(map.get("bid") == "b003");
    }


}