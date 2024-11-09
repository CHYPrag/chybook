package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
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
