package com.xyz.LMS.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.xyz.LMS.model.Book;
import com.xyz.LMS.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

   

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "book";
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "bookDetails";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/books/";
    }
}
