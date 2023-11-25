package com.xyz.LMS.service;

import java.util.List;

import com.xyz.LMS.model.Book;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    void saveBook(Book book);

    void deleteBook(Long id);
}
