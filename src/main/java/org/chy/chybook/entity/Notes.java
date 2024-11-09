package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.Data;

/**
 * @author CHY
 * @since 2024-10-31
 */
@Data
@TableName("Notes")
public class Notes {
    @MppMultiId
    private String bid;
    @MppMultiId
    private String uid;
    /**
     * 在哪一页做的笔记
     */
    @MppMultiId
    private Integer page;
    /**
     * 这条笔记是否私有：0(否)1(是)
     */
    private Boolean is_private;
    /**
     * 笔记内容
     */
    private String contents;
}
