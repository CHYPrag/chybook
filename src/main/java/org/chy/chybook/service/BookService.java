package org.chy.chybook.service;

import org.chy.chybook.entity.Book;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface BookService {

    long addBook(Book book);
    long deleteBook(Book book);
    long modifyBook(Book book);
    long enableOnShelf(Book books);
    long disableOnShelf(Book book);
    /**
     * 检索图书
     * @param book
     * @return
     */
    List<Book> findBook(Book book);
    /**
     * 依关键字搜索图书
     * @param keyword
     * @return
     */
    List<Book> findBook(String keyword);

    /**
     * 每个用户可以对书籍进行评分，系统会自动将评分纳入这本书的属性，以
     * 平均分作为最终值。不过，此方法必须是线程安全的。
     * @param bid
     */
    void ratingBook(String bid,float score);
    /**
     * 首页管理 -- 大家再看
     */
    List<Book> hotBooks();
    /**
     * 首页管理 -- 为你推荐
     */
    List<Book> recommendBooks();
    /**
     * 首页管理 -- 新书速递
     */
    List<Book> newBooks();
    /**
     * 首页管理 -- 轮播图
     */
    List<Book> sildeBooks();
}