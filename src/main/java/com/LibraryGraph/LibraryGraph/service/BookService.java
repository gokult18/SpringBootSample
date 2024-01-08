package com.LibraryGraph.LibraryGraph.service;

import com.LibraryGraph.LibraryGraph.model.Book;
import com.LibraryGraph.LibraryGraph.repository.BookRepository;
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

        Book save = bookrepository.save(books);
        return save;
    }
    public List<Book> getByLimit(Integer number)
    {
        return bookrepository.getByLimit(number);
    }
    public Book  getById( Integer id )
    {
        Book book= bookrepository.findById(id)
                .orElseThrow(()->new RuntimeException("No Book with that Id"));
        return book;
    }
    public Book updateBook(Integer id , String name)
    {
        Book book= bookrepository.findById(id)
                .orElseThrow(()->new RuntimeException("No Book with that Id"));
        book.setName(name);
        return bookrepository.save(book);
    }
    public String  deleteBook(Integer id )
    {
        Book book= bookrepository.findById(id)
                .orElseThrow(()->new RuntimeException("No Book with that Id"));
        bookrepository.delete(book);
        return  "Deleted";
    }
    public String  deleteByName(String name )
    {
        List<Book> book= bookrepository.findByName(name);
        bookrepository.deleteAll(book);
         return  "Deleted"+book.get(0).GetName();
    }
}
