package com.book.store.bookstore.repositories;

import java.util.Locale.Category;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends BaseRepository<Category, Long> {

}
