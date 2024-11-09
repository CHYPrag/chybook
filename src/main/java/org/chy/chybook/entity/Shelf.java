package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.Data;

/**
 * @author CHY
 * @since 2024-10-31
 */
@Data
@TableName("Shelf")
public class Shelf {
    @MppMultiId
    @TableField("uid")
    private String uid;
   @MppMultiId
   @TableField("bid")
    private String bid;
}
