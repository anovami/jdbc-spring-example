package ru.itgirl.jdbcspringexample.repository;

import ru.itgirl.jdbcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    Book findBook();

    List<Book> findAllBooks();
}
