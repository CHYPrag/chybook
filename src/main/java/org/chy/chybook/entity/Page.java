package org.chy.chybook.entity;

import lombok.Data;

import java.util.HashMap;

/**
 * 用户所阅读的图书的一页内容
 * @author CHY
 * @since 2024-11-11
 */
@Data
public class Page {
    /**
     * 文本
     */
    private String text;
    /**
     * 属性text转换成字节后的偏移量，对应的插图路径
     */
    private HashMap<Long,String> imgs;
}
