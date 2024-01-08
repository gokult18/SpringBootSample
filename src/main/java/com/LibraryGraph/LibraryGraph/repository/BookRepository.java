package com.LibraryGraph.LibraryGraph.repository;

import com.LibraryGraph.LibraryGraph.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByName(String name);
    @Query (value = "select * from books  limit ?1 " ,nativeQuery = true)
    List<Book> getByLimit(Integer number);
}
