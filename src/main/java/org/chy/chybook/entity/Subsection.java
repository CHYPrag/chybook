package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author CHY
 * @since 2024-11-02
 */
@Data
@TableName("Subsections")
public class Subsection {
    @TableId
    private String ssecid;
    private String secid;
    /**
     * 子节序数
     */
    private Integer subsection;
    private String title;
    /**
     * 本节文本流中子节开头处偏移量
     */
    private Long pointer;
}
