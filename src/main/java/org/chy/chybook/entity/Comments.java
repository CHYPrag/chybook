package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author CHY
 * @since 2024-10-31
 */
@Data
@TableName("Comments")
public class Comments {
    @MppMultiId
    private String bid;
    @MppMultiId
    private String uid;
    /**
     * 1(很好)2(一般)3(不行)
     */
    private Byte label;
    /**
     * 评论的内容
     */
    private String contents;
    private LocalDateTime comment_time;
}
