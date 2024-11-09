package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author CHY
 * @since 2024-10-31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName( "Admin")
public class Admin {
    private String id;
    private String password;
}
