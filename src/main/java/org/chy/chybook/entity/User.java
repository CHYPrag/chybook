package org.chy.chybook.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author CHY
 * @since 2024-10-31
 */
@Data
@TableName("User")
public class User {
    /**
     * 用户ID作为唯一标识
     */
    @TableId
    private String uid;
    /**
     * 通常是单向加密（通常是加了盐又反复几次的）后的
     */
    private String password;
    /**
     * 昵称
     */
    private String name;
    /**
     * 取值："男"或"女"
     */
    private String sex;
    private Integer age;
    private String phone;
    private String address;
    /**
     * 标识用户是否被锁定：0(unlocked),1(locked)
     */
    private Boolean is_lock;
    /**
     * 标识用户的VIP级别：0(无)1(vip)
     */
    private Boolean is_vip;
    /**
     * VIP到期时间
     */
    private LocalDateTime vip_expire_datetime;
    /**
     * 头像路径
     */
    private String img;
    /**
     * 阅读时长
     */
    private Integer read_time;
    /**
     * 阅读书籍总数
     */
    private Integer read_book_sum;
    /**
     * 读完书籍数
     */
    private Integer read_book_complete;
    /**
     * 兴趣领域
     */
    private Byte interst_field;
    /**
     * 关注数'
     */
    private Integer concern_sum;
    /**
     * 点赞数
     */
    private Integer likes_sum;
    /**
     * 注册时间
     */
    private LocalDateTime create_datetime;
}
