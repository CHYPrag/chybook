package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author CHY
 * @since 2024-11-02
 */
@Data
@TableName("Sections")
public class Section {
    /**
     * 图书节ID
     */
    private String secid;
    private String chid;
    private Integer sectioon;
    private String title;
    /**
     * 本章文本流中节开头的偏移量
     */
    private Long pointer;
}
