package com.hashimati.ahmed.micronautdata;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Controller(value = "/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService)
    {
        this.bookService = bookService;
    }

    @Get("/book")
    @Produces(MediaType.APPLICATION_JSON)
    public Book insertBook()
    {
        Book book = new Book();
        book.setTitle("The Stand");
        book.setPages(1000);
       return bookService.insertBook(book);
    }

    @Get("/book/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
}
