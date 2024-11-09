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
@TableName("Book")
public class Book {
    @TableId
    private String bid;
    private String name;
    /**
     * 作者，以英文逗号分割
     */
    private String authors;
    private String isbn;
    /**
     * 一级分类
     */
    private String first_category;
    /**
     * 二级分类
     */
    private String second_category;
    /**
     * 出版社
     */
    private String publisher;
    /**
     * 出品方
     */
    private String producer;
    /**
     * 出版年份
     */
    private Integer publish_year;
    /**
     * 页数
     */
    private Integer page_sum;
    /**
     * 价格
     */
    private Float price;
    /**
     * 用逗号分隔的图书封面图片路径
     */
    private String cover_img;
    /**
     * 标识图书状态：1(免费),2(限免),3(VIP可读)
     */
    private Byte state;
    /**
     * 限免图书可读时间/天
     */
    private Integer readable_day;
    /**
     * 标识图书是否上架：0(否)1(是)
     */
    private Boolean is_on_sh;
    /**
     * 内容简介
     */
    private String abst;
    /**
     * 图书评分(1--10)
     */
    private Float score;
    private LocalDateTime create_datetime;
    private LocalDateTime update_date;
}
