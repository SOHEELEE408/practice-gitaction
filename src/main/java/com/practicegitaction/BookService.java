package com.practicegitaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public BookDto findById(Long id){
        Book book = bookRepository.findById(id).orElseThrow(()-> new NoSuchElementException());
        return new BookDto(book.getTitle(), book.getImgUrl(), book.getAuthor(), book.getPublisher());
    }

    public Long save(Book book){
        Book savedBook = bookRepository.save(book);
        return savedBook.getId();
    }
}
