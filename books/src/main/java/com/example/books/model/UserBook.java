package com.example.books.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class UserBook {
    private Long courseId;
    private List<Book> books;

}
