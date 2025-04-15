package com.book.store.bookstore.mapper;

import java.util.Locale.Category;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.book.store.bookstore.dto.book.BookCreateDTO;
import com.book.store.bookstore.dto.book.BookResponseDTO;
import com.book.store.bookstore.entities.Author;
import com.book.store.bookstore.entities.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    Book toEntity(BookCreateDTO dto, Author author, Category category);

    @Mapping(target = "authorName", source = "author.name")
    @Mapping(target = "categoryName", source = "category.name")
    BookResponseDTO toDto(Book book);
}
