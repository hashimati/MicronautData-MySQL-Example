package com.hashimati.ahmed.micronautdata;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class BookService {


    @Inject
    private BookRepository bookRepository;

    public Book insertBook(Book book)
    {
       return  bookRepository.save(book);
    }


    public Iterable<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }


}
