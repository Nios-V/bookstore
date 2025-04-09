package com.book.store.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.store.bookstore.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
