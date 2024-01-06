package com.LibraryGraph.LibraryGraph.repository;

import com.LibraryGraph.LibraryGraph.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByName(String name);
}
