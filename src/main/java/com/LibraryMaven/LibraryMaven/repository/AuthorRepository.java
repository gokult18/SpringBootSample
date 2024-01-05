package com.LibraryMaven.LibraryMaven.repository;

import com.LibraryMaven.LibraryMaven.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
         @Query(nativeQuery = true , value = "select * from author where name={author}")
         List<Author> findByCategory(String authors);
}
