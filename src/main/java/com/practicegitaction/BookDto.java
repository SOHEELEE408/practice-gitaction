package com.practicegitaction;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookDto {

    private String title;
    private String imgUrl;
    private String author;
    private String publisher;
}
