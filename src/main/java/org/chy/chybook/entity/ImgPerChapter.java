package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author CHY
 * @since 2024-11-02
 */
@Data
@TableName( "img_per_chapter")
public class ImgPerChapter {
    @TableId
    private String imgid;
    private String chid;
    /**
     * 图片路径
     */
    private String path;
    /**
     * 每章文本流中图片嵌入处的偏移量
     */
    private Long pointer;
}
