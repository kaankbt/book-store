package com.kaankubat.bookstore.repository;

import com.kaankubat.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}