package com.LibraryGraph.LibraryGraph.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Integer memberId;
    @Setter
    private String name;

    public Book(String book) {
     this.name=book;
    }
}
