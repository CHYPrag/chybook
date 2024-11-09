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
@TableName( "Chapters")
public class Chapter {
    /**
     * 章节ID 主键
     */
    private String chid;
    private String bid;
    /**
     * 章序数
     */
    private Integer chapter;
    /**
     * 章标题
     */
    private String title;
    /**
     * 本章文本资源路径
     */
    private String chapter_text;
}