package com.LibraryGraph.LibraryGraph.service;

import com.LibraryGraph.LibraryGraph.model.Book;
import com.LibraryGraph.LibraryGraph.model.BookInput;
import com.LibraryGraph.LibraryGraph.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookrepository;


    public BookService(BookRepository bookrepository) {
        this.bookrepository = bookrepository;
    }
    public List<Book> getBooks()
    {
        return bookrepository.findAll();
    }
    public Book putBook(String name)
    {
        Book books=new Book(name);
        System.out.println(books);

        Book save = bookrepository.save(books);
        System.out.println(save);
        return save;
    }
}
