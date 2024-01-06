package com.LibraryGraph.LibraryGraph.controller;

import com.LibraryGraph.LibraryGraph.model.Book;
import com.LibraryGraph.LibraryGraph.model.BookInput;
import com.LibraryGraph.LibraryGraph.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller
public class BookController {
    @Autowired
   private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @QueryMapping
    public List<Book> getBook(){
        return bookService.getBooks();
    }
    @MutationMapping
    public Book addBook(@Argument String name)
    {
        System.out.println(name);
        return bookService.putBook(name);

    }

}
