package org.chy.chybook.service;

import org.chy.chybook.entity.Catalog;
import org.springframework.http.HttpRequest;

/**
 * 为用户提供在线图书阅读的服务
 * @author CHY
 * @since 2024-11-01
 */
public interface ReadingService {
    /**
     * 显示图书目录，通过查询组装
     * @param bid
     * @return
     */
    Catalog showCatelog(String bid);

    /**
     * 显示bid的图书中具体第page页页面内容
     * @param bid
     * @param page -- 页面序数（第page页）
     */
    void showPage(String bid,int page);

    /**
     * 显示下一页（可以往前或后翻页）
     */
    void showNextPage(String bid,int curPage);

    /**
     * 回到书籍顶部
     */
    void returnTop(String bid);

    /**
     * 回到图书底部
     */
    void returnBottom(String bid);

    /**
     * 跳转至某一章
     */
    void jumpToChapter(String bid,int chapter);
    /**
     * 跳转至某一节
     */
    void jumpToSection(String bid,int section);
    /**
     * 跳转至某一子节
     */
    void jumpToSubsection(String bid,int subsection);
}