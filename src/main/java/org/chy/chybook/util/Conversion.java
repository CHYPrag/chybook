package org.chy.chybook.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 用于对象相关属性之间转换
 * @author CHY
 * @since 2024-11-11
 */
public class Conversion {

    public static <T> T MapToObject(Map map,Class<? extends T> clazz) throws InstantiationException, IllegalAccessException {
        T t = clazz.newInstance();
        if(map ==null || map.isEmpty())return t;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if(map.get(field.getName()) != null){
                field.setAccessible(true);
                field.set(t,map.get(field.getName()));
            }
        }
        return t;
    }

    public static <T> Map<String,Object> ObjectToMap(T t,Class<? extends T> clazz) throws IllegalAccessException {
        Map<String,Object> map=new HashMap<>();
        if(t == null)return map;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            map.put(field.getName(),field.get(t));
        }
        return map;
    }
}
