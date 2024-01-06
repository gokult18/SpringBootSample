package com.LibraryGraph.LibraryGraph.controller;

import com.LibraryGraph.LibraryGraph.model.Book;
import com.LibraryGraph.LibraryGraph.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

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
    @QueryMapping
    public Book getById(@Argument Integer id){
        return bookService.getById(id);
    }
    @MutationMapping
    public Book addBook(@Argument String name)
    {
        return bookService.putBook(name);

    }
    @MutationMapping
    public  Book updateBook(@Argument Integer id ,@Argument String name)
    {
        return  bookService.updateBook(id, name);
    }
    @MutationMapping
    public  String  deleteBook(@Argument Integer id )
    {
        bookService.deleteBook(id);
        return "Deleted Success!!";
    }
    @MutationMapping
    public  String  deleteByName(@Argument String name )
    {
        bookService.deleteByName(name);
        return "Deleted Success!!";
    }
}
