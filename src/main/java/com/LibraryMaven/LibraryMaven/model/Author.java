package com.LibraryMaven.LibraryMaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table (name = "author")
public class Author {
        @Id
        @GeneratedValue
        private Long authorId;
        private String name;

}