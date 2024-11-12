package org.chy.chybook.service;

import com.github.jeffreyning.mybatisplus.service.IMppService;
import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.Book;
import org.chy.chybook.entity.BookList;
import org.chy.chybook.entity.Shelf;
import org.springframework.http.HttpRequest;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface BookShelfService extends IMppService<Shelf> {
    void addToShelf(String bid,String uid);
    void removeToShelf(String bid,String uid);

    /**
     * 在书架中查找书籍
     * @param book
     * @return
     */
    List<Book> findBook(Book book,String uid);

    /**
     * 依关键字查找书籍
     * @param keyword
     * @return
     */
    List<Book> findBook(String keyword,String uid);

    /**
     * 清空书架
     */
    void clearShelf(String uid);
}
