package com.LibraryMaven.LibraryMaven.service;
import com.LibraryMaven.LibraryMaven.model.Author;
import com.LibraryMaven.LibraryMaven.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AuthorSevice {
        @Autowired
        AuthorRepository authorRepository;
        public List<Author> getAuthor()
        {
            return authorRepository.findAll();
        }
        public List<Author> getByAuthor(List<Integer> author_Id) {
                List<Integer> author=author_Id;
            return authorRepository.findAllById(author);
        }

    public List<Author> getByAuthors(String authors) {

            return authorRepository.findByCategory(authors);
    }
}
