package org.chy.chybook.service;

import org.chy.chybook.entity.Book;

import java.util.List;

/**
 * @author CHY
 * @since 2024-11-01
 */
public interface BookService {
    List<Book> findBook(Book book);
    long modifyBook(Book book);
    long deleteBook(Book book);
    long addBook(Book book);
    long enableOnShelf(Book books);
    long disableOnShelf(Book book);
}
