package com.hashimati.ahmed.micronautdata;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import javax.inject.Singleton;

@Controller(value = "/api")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @Get("/book")
    @Produces(MediaType.APPLICATION_JSON)
    public Book insertBook()
    {
        Book book = new Book();
        book.setTitle("The Stand");
        book.setPages(1000);
       bookRepository.save(book);
        return book;

    }
}
