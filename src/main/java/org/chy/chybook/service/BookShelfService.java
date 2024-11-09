package org.chy.chybook.service;

import com.github.jeffreyning.mybatisplus.service.IMppService;
import jakarta.servlet.http.HttpSession;
import org.chy.chybook.entity.Book;
import org.chy.chybook.entity.BookList;
import org.springframework.http.HttpRequest;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface BookShelfService extends IMppService {
    void addToShelf(Book book, HttpSession session);
    void removeToShelf(Book book, HttpSession session);
    List<Book> findBook(Book book);
    void clearShelf(HttpRequest request);
    List<BookList> findBookList(BookList bookList);

}
