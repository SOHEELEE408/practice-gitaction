package com.practicegitaction;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}")
    public BookDto findById(@PathVariable("id") Long bookId){
        return bookService.findById(bookId);
    }

    @PostMapping
    public Long save(@RequestBody Book book){
        return bookService.save(book);
    }

}
