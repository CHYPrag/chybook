package org.chy.chybook.service;

import com.github.jeffreyning.mybatisplus.service.IMppService;
import org.chy.chybook.entity.Book;
import org.chy.chybook.entity.BookList;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-11
 */
public interface BookListService extends IMppService<BookList> {

    /**
     * 至少选择一本书来创建书单
     * @param bookList
     */
    void createBookList(BookList bookList);
    void removeBook(Book book);
    void removeBookList(BookList bookList);

    /**
     * 查找书单
     * @param bookList 所依据的条件封装成的BookList对象
     * @return 书单列表
     */
    List<BookList> findBookList(BookList bookList);
}