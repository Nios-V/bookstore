package com.book.store.bookstore.repositories;

import org.springframework.stereotype.Repository;

import com.book.store.bookstore.entities.Book;

@Repository
public interface BookRepository extends BaseRepository<Book, Long> {

}
