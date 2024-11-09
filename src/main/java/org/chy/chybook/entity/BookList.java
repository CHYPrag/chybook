package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * @author CHY
 * @since 2024-10-31
 */
@Data
@TableName("BookList")
public class BookList implements Serializable {
    @MppMultiId
    private String uid;
    @MppMultiId
    private String lid;
    @MppMultiId
    private String bid;
    /**
     * 0公开,1私有
     */
    private Boolean is_private;
}
