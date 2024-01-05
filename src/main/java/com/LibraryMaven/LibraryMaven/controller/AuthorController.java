package com.LibraryMaven.LibraryMaven.controller;

import com.LibraryMaven.LibraryMaven.model.Author;
import com.LibraryMaven.LibraryMaven.repository.AuthorRepository;
import com.LibraryMaven.LibraryMaven.service.AuthorSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Author")
public class AuthorController {
    @Autowired
    AuthorSevice authorService;

    @Autowired
    AuthorRepository authorRepository;
    @GetMapping("getAuthor")
    public List<Author> getAuthors() {
        return authorService.getAuthor();
    }
    @PostMapping("/addAuthor")

    public Author addAuthor(@RequestBody Author author) {

        authorRepository.save(author);
        return author;
    }
    @GetMapping("getAuthor/{author}")
    public List<Author> getAuthor(@PathVariable("author") List<Integer> authorId)
    {
        return authorService.getByAuthor(authorId);
    }
    @GetMapping("getAuthors/{authors}")
    public List<Author> getAuthor(@PathVariable("authors") String author)
    {
        return authorService.getByAuthors(author);
    }

}
